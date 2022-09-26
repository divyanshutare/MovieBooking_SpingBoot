package com.bct.movieTicket.moviebooking.show;

import com.bct.movieTicket.moviebooking.cinemahall.CinemaHall;
import com.bct.movieTicket.moviebooking.cinemahall.CinemaHallRepository;
import com.bct.movieTicket.moviebooking.exception.CinemaHallNotFoundException;
import com.bct.movieTicket.moviebooking.exception.InvalidTimeException;
import com.bct.movieTicket.moviebooking.exception.MovieNotFoundExpection;
import com.bct.movieTicket.moviebooking.exception.SameTimeShowException;
import com.bct.movieTicket.moviebooking.movie.Movie;
import com.bct.movieTicket.moviebooking.movie.MovieRepository;
import com.bct.movieTicket.moviebooking.user.Users;
import com.bct.movieTicket.moviebooking.user.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class ShowService {

    @Autowired
    ShowRepository showRepository;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    CinemaHallRepository cinemaHallRepository;


    public Show addShow(int id, int movieId, Show show) {
        CinemaHall cinemaHall= cinemaHallRepository.findById(id).orElse(null);
        Optional<Movie> movie = movieRepository.findById(movieId);
        if (cinemaHall == null) {
            throw new CinemaHallNotFoundException("Cinema Hall not found cinemaHallId - " + id);
        }
        show.setCinemaHallID(cinemaHall);
        if (!movie.isPresent()) {
            throw new MovieNotFoundExpection("Movie not found movieId - " + movieId);
        }
        Time calEndTime = Time.valueOf(LocalTime.ofNanoOfDay(show.getStartTime().toLocalTime().toNanoOfDay() + movie.get().getDuration().toLocalTime().toNanoOfDay()));
        show.setEndTime(calEndTime);
        show.setMovie(movie.get());
        List<Show> showList = showRepository.findAll();
        int cinemaHallId = cinemaHall.getCinemaHallId();
        for (Show shows :
                showList) {
            if (show.getStartTime().after(show.getEndTime())) {
                throw new InvalidTimeException("Start time is after End time");
            }
            if (shows.getCinemaHallID().getCinemaHallId() == cinemaHallId &&
                    shows.getDate().toString().equalsIgnoreCase(show.getDate().toString()) &&
                    (shows.getStartTime().equals( show.getStartTime() ) || shows.getStartTime().equals(show.getEndTime())
                            || shows.getEndTime().equals( show.getStartTime() ) || shows.getEndTime().equals(show.getEndTime()) )   ||
                    ( shows.getEndTime().after(show.getStartTime()) && shows.getStartTime().before(show.getStartTime()))||
                    (shows.getStartTime().after(show.getEndTime()) && shows.getStartTime().before(show.getEndTime()) ) ||
                    (shows.getStartTime().after(show.getStartTime()) && shows.getStartTime().before(show.getEndTime())  )
            ) {
                throw new SameTimeShowException("time can not be same for two show in cinema hall - " + show.getStartTime());
            }
        }
        List<Users> usersList = usersRepository.findAll();
        for (Users user :
                usersList) {
            System.out.println("New Movie notification sent to userId - " + user.getUserId());
        }
        return showRepository.save(show);
    }

    public List<Show> getAllShow() {
        List<Show> showList =  showRepository.findAll();
        return showList;
    }
}
