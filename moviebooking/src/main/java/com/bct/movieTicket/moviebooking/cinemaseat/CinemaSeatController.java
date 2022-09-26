package com.bct.movieTicket.moviebooking.cinemaseat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaSeatController {
    @Autowired
    CinemaSeatService cinemaSeatService;

    @GetMapping("/cinemaseats/cinemahallid/{id}")
    public CinemaSeatReturn getCinemaSeats(@PathVariable int id) {
         return cinemaSeatService.getCinemaSeats(id);
    }


}
