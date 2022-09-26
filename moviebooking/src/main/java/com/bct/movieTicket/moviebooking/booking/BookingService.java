package com.bct.movieTicket.moviebooking.booking;


import com.bct.movieTicket.moviebooking.cinemaseat.CinemaSeat;
import com.bct.movieTicket.moviebooking.cinemaseat.CinemaSeatRepository;
import com.bct.movieTicket.moviebooking.exception.*;
import com.bct.movieTicket.moviebooking.show.Show;
import com.bct.movieTicket.moviebooking.show.ShowRepository;
import com.bct.movieTicket.moviebooking.user.showseat.ShowSeat;
import com.bct.movieTicket.moviebooking.user.showseat.ShowSeatRepository;
import com.bct.movieTicket.moviebooking.user.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    ShowRepository showRepository;

    @Autowired
    CinemaSeatRepository cinemaSeatRepository;

    @Autowired
    ShowSeatRepository showSeatRepository;

    @Autowired
    UsersRepository usersRepository;

    public Optional<Booking> getById(int id) {
        Optional<Booking> booking = bookingRepository.findById(id);
        return booking;
    }


    @Transactional
    public List<Booking> makeBooking(BookingDTO booking) {
        // Get All the seat wanted to book
        int[] cinemaSeatList = booking.getCinema_seat_id();
        // List to be returned with booked seat
        List<Booking> bookingList = new ArrayList<Booking>();

        if (booking.getCinema_seat_id().length > 5) {
            throw new TooManySeatException("You can't book more than 5 seat at a time");
        }
        // For Getting the individual seat for booking
        for (int i :
                cinemaSeatList) {
            CinemaSeat cinemaSeat1 = cinemaSeatRepository.findById(i).orElse(null);
            if (cinemaSeat1 == null) {
                    throw new CinemaSeatNotFoundException("Cinema Seat not found cinemaSeatId - " + i);
            }
            List<ShowSeat> showSeatList = cinemaSeat1.getShowSeatList();
            if (showSeatList.size() == 0)  {
                    Show show = showRepository.findById(booking.getShow_id()).orElse(null);
                    if (show == null) {
                            throw  new ShowNotFoundException("Show not found seatId - " + booking.getShow_id());
                    }
                Booking booking2 = new Booking(show.getDate(), "Booked", usersRepository.findById(booking.getUser_id()).orElse(null),
                        showRepository.findById(booking.getShow_id()).orElse(null));
                bookingList.add(bookingRepository.save(booking2));
                ShowSeat showSeat = new ShowSeat(booking2.getStatus(), 50, booking2,
                        showRepository.findById(booking.getShow_id()).orElse(null),
                        cinemaSeat1);
                showSeatRepository.save(showSeat);
                System.out.println("Notification for booking sent to getUser_id - "  + booking.getUser_id());
            } else {
                for (ShowSeat showSeat :
                        showSeatList) {
                    // To check if the seat already booked for the same show requested for
                    ShowSeat showSeat1 = showSeatRepository.findById(showSeat.getShowSeatId()).orElse(null);
                    if (showSeat1 == null) {
                            throw new ShowSeatNotFoundException("Show Seat not found showSeatId - " + showSeat1);
                    }
                    if (showSeat1.getStatus().equalsIgnoreCase("Booked") && showSeat1.getShow().getShowId() == booking.getShow_id()) {
                        if(bookingList != null) {
                            Iterator<Booking> bookingIterator = bookingList.iterator();
                            while (bookingIterator.hasNext()) {
                                Booking temp = (Booking) bookingIterator.next();
                                temp.setStatus("Cancelled");
                                System.out.println("Notification sent for cancelled ticket userID - " + booking.getUser_id());
                            }
                        }
                        throw new SeatAlreadyBookedException("SeatId - " + showSeat.getCinemaSeat().getCinemaSeatId() + " already booked");
                    }
                }
            }
        }
        return bookingList;
    }
}
