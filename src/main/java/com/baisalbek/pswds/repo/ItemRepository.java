package com.baisalbek.pswds.repo;

import com.baisalbek.pswds.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {

}