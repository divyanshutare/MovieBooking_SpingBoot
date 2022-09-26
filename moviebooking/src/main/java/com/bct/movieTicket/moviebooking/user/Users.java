package com.bct.movieTicket.moviebooking.user;


import com.bct.movieTicket.moviebooking.booking.Booking;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @NotNull(message = "Name can not be null")
    private String name;

    @NotNull(message = "Password can not be null")
    private String password;

    @Email(message = "Not valid email")
    private String email;

    @Max(value = 10, message = "Phone length should be 10")
    @Min(value = 10, message = "Phone length should be 10")
    @NotNull(message = "Phone can not be null")
    private  long phone;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookingList;


    public Users() {
    }

    public Users(int userId, String name, String password, String email, long phone) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }


    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", bookingList=" + bookingList +
                '}';
    }
}
