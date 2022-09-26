package com.bct.movieTicket.moviebooking.cinemaseat;

import com.bct.movieTicket.moviebooking.cinemahall.CinemaHall;
import com.bct.movieTicket.moviebooking.cinemahall.CinemaHallRepository;
import com.bct.movieTicket.moviebooking.exception.CinemaHallNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CinemaSeatService {

    @Autowired
    CinemaSeatRepository cinemaSeatRepository;

    @Autowired
    CinemaHallRepository cinemaHallRepository;

    public CinemaSeatReturn getCinemaSeats(int id) {

        CinemaHall cinemaHall = cinemaHallRepository.findById(id).orElse(null);
        if (cinemaHall == null) {
            throw new CinemaHallNotFoundException("Cinema Hall not found cinemaID - " + id);
        }
        List<CinemaSeat> cinemaSeatList = cinemaSeatRepository.findAll();
        List<CinemaSeat> bookedList = new ArrayList<>();
        List<CinemaSeat> unBookedList = new ArrayList<>();

        for (CinemaSeat cinemaSeat :
                cinemaSeatList) {
            if (cinemaSeat.getCinemaHall().getCinemaHallId() == cinemaHall.getCinemaHallId()) {

                if (cinemaSeat.getShowSeatList().size() > 0) {
                    bookedList.add(cinemaSeat);
                } else {
                    unBookedList.add(cinemaSeat);
                }
            }
        }
        CinemaSeatReturn cinemaSeatReturn = new CinemaSeatReturn(bookedList, unBookedList);
        return cinemaSeatReturn;
    }
}
