package com.bct.movieTicket.moviebooking.show;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowController {
    @Autowired
    ShowService showService;

    @GetMapping("/shows")
    public List<Show> getAllShow() {
        return showService.getAllShow();
    }

    @PostMapping("/shows/cinemahallid/{id}/movieid/{movieId}")
    public Show addShow(@PathVariable int id, @PathVariable int movieId, @RequestBody Show show) {
        return showService.addShow(id, movieId,show);
    }

}
