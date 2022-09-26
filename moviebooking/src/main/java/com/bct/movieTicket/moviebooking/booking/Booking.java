package com.bct.movieTicket.moviebooking.booking;


import com.bct.movieTicket.moviebooking.show.Show;
import com.bct.movieTicket.moviebooking.user.showseat.ShowSeat;
import com.bct.movieTicket.moviebooking.user.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int bookingId;

    private Date time;

    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Users user;

    @OneToMany(mappedBy = "booking")
    @JsonIgnore
    private List<ShowSeat> showSeatList;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    private Show show;

    public Booking() {
    }

    public Booking( Date time, String status, Users user, Show show) {
        this.time = time;
        this.status = status;
        this.user = user;
        this.show = show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setShowSeatList(List<ShowSeat> showSeatList) {
        this.showSeatList = showSeatList;
    }

    public List<ShowSeat> getShowSeatList() {
        return showSeatList;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Date getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    public Users getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", time=" + time +
                ", status='" + status + '\'' +
                ", user=" + user.getUserId() +
                '}';
    }
}
