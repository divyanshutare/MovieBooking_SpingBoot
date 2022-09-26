package com.bct.movieTicket.moviebooking.booking;

import java.util.Arrays;

public class BookingDTO  {

    private int[] cinema_seat_id;

    private int show_id;

    private int user_id;


    public BookingDTO() {
    }

    public BookingDTO(int[] cinema_seat_id, int show_id, int user_id) {
        this.cinema_seat_id = cinema_seat_id;
        this.show_id = show_id;
        this.user_id = user_id;
    }

    public void setCinema_seat_id(int[] cinema_seat_id) {
        this.cinema_seat_id = cinema_seat_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int[] getCinema_seat_id() {
        return cinema_seat_id;
    }

    public int getShow_id() {
        return show_id;
    }

    public int getUser_id() {
        return user_id;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "cinema_seat_id=" + Arrays.toString(cinema_seat_id) +
                ", show_id=" + show_id +
                ", user_id=" + user_id +
                '}';
    }
}
