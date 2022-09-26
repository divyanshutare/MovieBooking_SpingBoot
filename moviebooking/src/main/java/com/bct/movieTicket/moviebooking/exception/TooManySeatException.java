package com.bct.movieTicket.moviebooking.exception;

public class TooManySeatException extends RuntimeException{

    public TooManySeatException(String s) {
        super(s);
    }
}
