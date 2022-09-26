package com.bct.movieTicket.moviebooking.cinemaseat;

import com.bct.movieTicket.moviebooking.cinemahall.CinemaHall;
import com.bct.movieTicket.moviebooking.user.showseat.ShowSeat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class CinemaSeat {

    @Id
    @GeneratedValue
    private int cinemaSeatId;

    private int seatNumber;

    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private CinemaHall cinemaHall;


    @OneToMany(mappedBy = "cinemaSeat")
    private List<ShowSeat> showSeatList;

    public CinemaSeat() {
    }

    public CinemaSeat(int cinemaSeatId, int seatNumber, String type, CinemaHall cinemaHall, List<ShowSeat> showSeatList) {
        this.cinemaSeatId = cinemaSeatId;
        this.seatNumber = seatNumber;
        this.type = type;
        this.cinemaHall = cinemaHall;
        this.showSeatList = showSeatList;
    }

    public void setCinemaSeatId(int cinemaSeatId) {
        this.cinemaSeatId = cinemaSeatId;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public void setShowSeatList(List<ShowSeat> showSeatList) {
        this.showSeatList = showSeatList;
    }

    public int getCinemaSeatId() {
        return cinemaSeatId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getType() {
        return type;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public List<ShowSeat> getShowSeatList() {
        return showSeatList;
    }
}
