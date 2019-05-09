package com.baisalbek.pswds.service.impl;

import com.baisalbek.pswds.entities.Person;
import com.baisalbek.pswds.repo.UserRepo;
import com.baisalbek.pswds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public Person createUser(Person person){
        if(userRepo.findByEmail(person.getEmail()) != null)
            throw new RuntimeException("NOW IN DB");
        userRepo.save(person);
        return person;
    }

    @Override
    public Person getUser(String email){
        if(userRepo.findByEmail(email) == null)
            throw new RuntimeException("NOT FOUND");
        Person person = userRepo.findByEmail(email);
        return person;
    }
}
