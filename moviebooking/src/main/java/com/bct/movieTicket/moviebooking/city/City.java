package com.bct.movieTicket.moviebooking.city;

import com.bct.movieTicket.moviebooking.cinema.Cinema;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@JsonIgnoreProperties(value= {"hibernateLazyInitializer", "handler", "FieldHandler"})
public class City {

    @Id
    @GeneratedValue
    private int cityId;

    private String name;

    private String state;

    @OneToMany(mappedBy = "city")
    @JsonIgnore
    private List<Cinema> cinemaList;

    public City() {
    }

    public City(int cityId, String name, String state, List<Cinema> cinemaList) {
        this.cityId = cityId;
        this.name = name;
        this.state = state;
        this.cinemaList = cinemaList;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    public int getCityId() {
        return cityId;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }
}
