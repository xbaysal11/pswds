package com.baisalbek.pswds.repo;

import com.baisalbek.pswds.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Person, Long> {
    public Person findByEmail(String email);
}
