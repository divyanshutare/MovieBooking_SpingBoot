package com.bct.movieTicket.moviebooking.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersController {

    @Autowired
    UsersService userService;

    @GetMapping("/users")
    public List<Users> getUser() {
    return userService.getUser();
    }

    @GetMapping("/users/{id}")
    public Optional<Users> getUserById(@PathVariable int id) {
        Optional<Users> user =  userService.getUserByID(id);
        return user;
    }



}
