package com.baisalbek.pswds.service;

import com.baisalbek.pswds.entities.Person;

public interface UserService {
    public Person createUser(Person person);
    public Person getUser(String email);
}
