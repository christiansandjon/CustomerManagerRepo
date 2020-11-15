package com.smc.entity;

import com.smc.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerEntityInterface extends CrudRepository<Customer, Long> {

}
