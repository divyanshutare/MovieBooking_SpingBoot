package com.bct.movieTicket.moviebooking.city;

import com.bct.movieTicket.moviebooking.exception.BookingNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping("/cinemas/{name}/cities")
    public List<City> getCitiesByCinemaId(@PathVariable String name) {
        List<City> cityList =  cityService.getCitiesByCinemaName(name);
        if (cityList == null) {
            throw  new BookingNotFoundException("not found");
        }
        return cityList;
    }

}
