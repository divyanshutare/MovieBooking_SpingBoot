package com.bct.movieTicket.moviebooking.exception;

public class SeatAlreadyBookedException extends RuntimeException{

    public SeatAlreadyBookedException(String s) {
        super(s);
    }
}
