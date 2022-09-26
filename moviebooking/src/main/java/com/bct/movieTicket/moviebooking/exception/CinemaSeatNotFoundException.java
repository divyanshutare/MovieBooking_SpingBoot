package com.bct.movieTicket.moviebooking.exception;

public class CinemaSeatNotFoundException extends RuntimeException {
    public CinemaSeatNotFoundException(String s) {
        super(s);
    }
}
