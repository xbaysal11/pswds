package com.baisalbek.pswds.controller;

import com.baisalbek.pswds.entities.Person;
import com.baisalbek.pswds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(
            produces = "application/json"
    )
    public Person getUser(@RequestParam(name="email", required = false) String email){

        Person personHere = userService.getUser(email);
        return personHere;
    }

    @PostMapping(
            consumes = "application/json",
            produces = "application/json"
    )
    public Person createUser(@RequestBody Person person){

        userService.createUser(person);
        return person;
    }
}
