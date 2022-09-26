package com.bct.movieTicket.moviebooking.show;

import com.bct.movieTicket.moviebooking.booking.Booking;
import com.bct.movieTicket.moviebooking.cinemahall.CinemaHall;
import com.bct.movieTicket.moviebooking.movie.Movie;
import com.bct.movieTicket.moviebooking.user.showseat.ShowSeat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class Show {

    @Id
    @GeneratedValue
    private int showId;

    @FutureOrPresent(message = "Date should be in future or Present")
    private java.sql.Date date;

    private Time startTime;

    private Time endTime;

    @OneToMany(mappedBy = "show")
    @JsonIgnore
    private List<Booking> bookingList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Movie movie;

    @OneToMany(mappedBy = "show")
    @JsonIgnore
    private List<ShowSeat> showSeatList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private CinemaHall cinemaHallID;

    public Show() {
    }

    public Show(int showId, java.sql.Date  date, Time startTime, Time endTime, List<Booking> bookingList, Movie movie, List<ShowSeat> showSeatList, CinemaHall cinemaHallID) {
        System.out.println("Hello");
        this.showId = showId;
        this.date = (java.sql.Date) date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.bookingList = bookingList;
        this.movie = movie;
        this.showSeatList = showSeatList;
        this.cinemaHallID = cinemaHallID;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setShowSeatList(List<ShowSeat> showSeatList) {
        this.showSeatList = showSeatList;
    }

    public void setCinemaHallID(CinemaHall cinemaHallID) {
        this.cinemaHallID = cinemaHallID;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<ShowSeat> getShowSeatList() {
        return showSeatList;
    }

    public CinemaHall getCinemaHallID() {
        return cinemaHallID;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }


    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public int getShowId() {
        return showId;
    }

    public Date getDate() {
        return date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }
}
