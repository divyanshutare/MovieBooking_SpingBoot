package com.bct.movieTicket.moviebooking.user;

import com.bct.movieTicket.moviebooking.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    UsersRepository userRepository;

    public List<Users> getUser() {
       return userRepository.findAll();
    }

    public Optional<Users> getUserByID(int id){
        Optional<Users> users =  userRepository.findById(id);
        if (!users.isPresent())
            throw new UserNotFoundException("id-" + id);
        return users;
    }
}
