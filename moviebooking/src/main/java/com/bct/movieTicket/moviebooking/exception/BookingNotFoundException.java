package com.bct.movieTicket.moviebooking.exception;

public class BookingNotFoundException extends RuntimeException{

    public BookingNotFoundException(String s) {
        super(s);
    }
}
