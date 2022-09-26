package com.bct.movieTicket.moviebooking.cinemahall;

import com.bct.movieTicket.moviebooking.cinema.Cinema;
import com.bct.movieTicket.moviebooking.cinemaseat.CinemaSeat;
import com.bct.movieTicket.moviebooking.show.Show;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class CinemaHall {

    @Id
    @GeneratedValue
    private int cinemaHallId;

    private String screen;

    private String TotalSeat;

    @OneToMany(mappedBy = "cinemaHallID")
    private List<Show> show;


    @OneToMany(mappedBy = "cinemaHall")
    @JsonIgnore
    private List<CinemaSeat> cinemaSeatList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Cinema cinema;

    public CinemaHall() {
    }

    public CinemaHall(int cinemaHallId, String screen, String totalSeat, List<Show> show, List<CinemaSeat> cinemaSeatList, Cinema cinema) {
        this.cinemaHallId = cinemaHallId;
        this.screen = screen;
        TotalSeat = totalSeat;
        this.show =  show;
        this.cinemaSeatList = cinemaSeatList;
        this.cinema = cinema;
    }

    public void setCinemaHallId(int cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }

    public void setName(String screen) {
        this.screen = screen;
    }

    public void setTotalSeat(String totalSeat) {
        TotalSeat = totalSeat;
    }

    public void setShow(List<Show> show) {
        this.show = show;
    }

    public void setCinemaSeatList(List<CinemaSeat> cinemaSeatList) {
        this.cinemaSeatList = cinemaSeatList;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public int getCinemaHallId() {
        return cinemaHallId;
    }

    public String getName() {
        return screen;
    }

    public String getTotalSeat() {
        return TotalSeat;
    }

    public Show getShow() {
        return (Show) show;
    }

    public List<CinemaSeat> getCinemaSeatList() {
        return cinemaSeatList;
    }

    public Cinema getCinema() {
        return cinema;
    }
}
