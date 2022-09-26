package com.bct.movieTicket.moviebooking.exception;

public class SameTimeShowException extends RuntimeException{
    public SameTimeShowException(String s) {
        super(s);
    }
}
