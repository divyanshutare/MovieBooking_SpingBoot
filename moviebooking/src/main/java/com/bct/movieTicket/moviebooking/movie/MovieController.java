package com.bct.movieTicket.moviebooking.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movies/search")
    public List<Movie> getMovieByFilter(@RequestParam(value = "title", required = false) String title,
                                        @RequestParam(value = "language", required = false) String language,
                                        @RequestParam(value = "releasedate", required = false)Date releaseDate,
                                        @RequestParam(value = "city", required = false) String city ) {
        return movieService.getMovieByFilter(title, language, releaseDate, city);
    }

    @GetMapping("/movies/{id}")
    public Movie getMovie(@PathVariable int id) {
        return movieService.getMovie(id);
    }
}
