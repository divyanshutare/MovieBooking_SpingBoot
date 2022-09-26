package com.bct.movieTicket.moviebooking.user.showseat;


import com.bct.movieTicket.moviebooking.booking.Booking;
import com.bct.movieTicket.moviebooking.cinemaseat.CinemaSeat;
import com.bct.movieTicket.moviebooking.show.Show;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class ShowSeat {

    @Id
    @GeneratedValue
    private  int showSeatId;

    private String status;

    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Booking booking;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    private Show show;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private CinemaSeat cinemaSeat;

    public ShowSeat() {
    }
    public ShowSeat( String status, int price, Booking booking, Show show, CinemaSeat cinemaSeat) {
        this.status = status;
        this.price = price;
        this.booking = booking;
        this.show = show;
        this.cinemaSeat = cinemaSeat;
    }

    public ShowSeat(int showSeatId, String status, int price, Booking booking, Show show, CinemaSeat cinemaSeat) {
        this.showSeatId = showSeatId;
        this.status = status;
        this.price = price;
        this.booking = booking;
        this.show = show;
        this.cinemaSeat = cinemaSeat;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setCinemaSeat(CinemaSeat cinemaSeat) {
        this.cinemaSeat = cinemaSeat;
    }

    public Show getShow() {
        return show;
    }

    public CinemaSeat getCinemaSeat() {
        return cinemaSeat;
    }

    public void setShowSeatId(int showSeatId) {
        this.showSeatId = showSeatId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getShowSeatId() {
        return showSeatId;
    }

    public String getStatus() {
        return status;
    }

    public int getPrice() {
        return price;
    }

    public Booking getBooking() {
        return booking;
    }

    @Override
    public String toString() {
        return "ShowSeat{" +
                "showSeatId=" + showSeatId +
                ", status='" + status + '\'' +
                ", price=" + price +
                ", booking=" + booking +
                ", show=" + show +
                ", cinemaSeat=" + cinemaSeat +
                '}';
    }
}
