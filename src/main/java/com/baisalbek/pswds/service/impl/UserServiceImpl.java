package com.baisalbek.pswds.service.impl;

import com.baisalbek.pswds.entities.User;
import com.baisalbek.pswds.repo.UserRepo;
import com.baisalbek.pswds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User createUser(User person){
        if(userRepo.findByEmail(person.getEmail()) != null)
            throw new RuntimeException("NOW IN DB");
        userRepo.save(person);
        return person;
    }

    @Override
    public User getUser(String email){
        if(userRepo.findByEmail(email) == null)
            throw new RuntimeException("NOT FOUND");
        User user = userRepo.findByEmail(email);
        return user;
    }

    @Override
    public String deleteUser(String email) {
        return null;
    }
}
