package com.anupam.springjpapostgre.controller;

import com.anupam.springjpapostgre.entity.User;
import com.anupam.springjpapostgre.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Integer id){
        return userRepository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) throws IOException {
        return userRepository.save(user);
    }
}
