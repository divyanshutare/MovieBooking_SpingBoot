package com.bct.movieTicket.moviebooking.cinema;

import com.bct.movieTicket.moviebooking.cinemahall.CinemaHall;
import com.bct.movieTicket.moviebooking.city.City;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(value= {"hibernateLazyInitializer", "handler", "FieldHandler"})
public class Cinema {
    @Id
    @GeneratedValue
    private int cinemaId;

    private String name;

    private String location;

    @OneToMany(mappedBy = "cinema")
    @JsonIgnore
    private List<CinemaHall> cinemaHallList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private City city;

    public Cinema() {
    }

    public Cinema(int cinemaId, String name, String location, List<CinemaHall> cinemaHallList, City city) {
        this.cinemaId = cinemaId;
        this.name = name;
        this.location = location;
        this.cinemaHallList = cinemaHallList;
        this.city = city;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCinemaHallList(List<CinemaHall> cinemaHallList) {
        this.cinemaHallList = cinemaHallList;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public String getName() {
        return name;
    }

    public List<CinemaHall> getCinemaHallList() {
        return cinemaHallList;
    }

    public City getCity() {
        return city;
    }
}
