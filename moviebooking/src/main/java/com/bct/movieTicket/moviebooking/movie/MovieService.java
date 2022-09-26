package com.bct.movieTicket.moviebooking.movie;

import com.bct.movieTicket.moviebooking.cinemahall.CinemaHall;
import com.bct.movieTicket.moviebooking.exception.MovieNotFoundException;
import com.bct.movieTicket.moviebooking.show.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getMovieByFilter(String title, String language,
                                        Date releaseDate, String city ) {
        List<Movie> movieList = movieRepository.findAll();
        Iterator<Movie> movies = movieList.iterator();
        while (movies.hasNext()) {
            Movie movie = movies.next();
            if (title != null && !movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                movies.remove();
            }
            if (language != null && !movie.getLanguage().toLowerCase().contains(language.toLowerCase())) {
                movies.remove();
            }
            if ( releaseDate != null && !movie.getReleaseDate().toString().contains(releaseDate.toString())) {
                movies.remove();
            }
            if (city != null ) {
                List<Show> showList = movie.getShowList();
                Iterator<Show> shows = showList.iterator();
                while (shows.hasNext()) {
                    Show show = shows.next();
                    CinemaHall cinemaHallId = show.getCinemaHallID();
                    String cityName = cinemaHallId.getCinema().getCity().getName();
                    if (!cityName.equalsIgnoreCase(city)) {
                        shows.remove();
                    }
                }
            }
            if (movie.getShowList().size() == 0)
                movies.remove();
        }
        return movieList;
    }

    public Movie getMovie(int id) {
        Movie movie = movieRepository.findById(id).orElse(null);
        if (movie == null) {
            throw new MovieNotFoundException("Movie Id not found movieId - " + id);
        }
        return  movie;
    }
}
