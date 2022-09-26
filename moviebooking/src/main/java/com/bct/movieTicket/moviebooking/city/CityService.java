package com.bct.movieTicket.moviebooking.city;

import com.bct.movieTicket.moviebooking.cinema.Cinema;
import com.bct.movieTicket.moviebooking.cinema.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    @Autowired
    CinemaRepository cinemaRepository;


    public List<City> getCitiesByCinemaName(String name) {
        List<Cinema> cinemaList = cinemaRepository.findAll();
        List<City> cityList = new ArrayList<City>();
        if (cinemaList != null) {
            for (Cinema cinema :
                    cinemaList) {
                if (cinema.getName().equalsIgnoreCase(name)) {
                    cityList.add(cinema.getCity());
                }
            }
        }
        return cityList;
    }
}
