package com.bct.movieTicket.moviebooking.cinemaseat;

import java.util.ArrayList;
import java.util.List;

public class CinemaSeatReturn {

    private List<CinemaSeat> bookedSeatList = new ArrayList<>();

    private List<CinemaSeat> unBookedseatList = new ArrayList<>();

    public CinemaSeatReturn() {
    }

    public CinemaSeatReturn(List<CinemaSeat> bookedSeatList, List<CinemaSeat> unBookedseatList) {
        this.bookedSeatList = bookedSeatList;
        this.unBookedseatList = unBookedseatList;
    }


    public void setBookedSeatList(List<CinemaSeat> bookedSeatList) {
        this.bookedSeatList = bookedSeatList;
    }

    public void setUnBookedseatList(List<CinemaSeat> unBookedseatList) {
        this.unBookedseatList = unBookedseatList;
    }

    public List<CinemaSeat> getBookedSeatList() {
        return bookedSeatList;
    }

    public List<CinemaSeat> getUnBookedseatList() {
        return unBookedseatList;
    }
}
