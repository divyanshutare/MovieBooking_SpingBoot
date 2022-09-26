package com.bct.movieTicket.moviebooking.booking;


import com.bct.movieTicket.moviebooking.exception.BookingNotFoundException;
import com.bct.movieTicket.moviebooking.exception.UserNotFoundException;
import com.bct.movieTicket.moviebooking.user.Users;
import com.bct.movieTicket.moviebooking.user.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookingController {

    @Autowired
    UsersService usersService;

    @Autowired
    BookingService bookingService;

    @GetMapping("/users/{id}/bookings")
    public List<Booking> getBookings(@PathVariable int id) {
        Optional<Users> user = usersService.getUserByID(id);
        if (!user.isPresent()) {
            throw  new UserNotFoundException("id - " + id);
        }
        return user.get().getBookingList();
    }

    @GetMapping("bookings/{id}")
    public Optional<Booking> getBookingsById(@PathVariable int id) {
        Optional<Booking> booking = bookingService.getById(id);
        if (!booking.isPresent()) {
            throw  new BookingNotFoundException("id - " + id);
        }
        return booking;
    }

    @PostMapping("/bookings")
    public List<Booking> makeBooking(@RequestBody BookingDTO booking) {
        return bookingService.makeBooking(booking);
    }


}
