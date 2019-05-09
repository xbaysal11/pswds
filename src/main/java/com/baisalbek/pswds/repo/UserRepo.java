package com.baisalbek.pswds.repo;

import com.baisalbek.pswds.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    public User findByEmail(String email);
}
