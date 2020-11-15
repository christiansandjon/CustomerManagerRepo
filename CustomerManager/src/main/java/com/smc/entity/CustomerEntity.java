package com.smc.entity;

import com.smc.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class CustomerEntity extends CrudRepository<Customer, long> {
    @Override
    public <S extends Customer> S save(S s) {
        return null;
    }

    @Override
    public Optional<Customer> findById(long l) {
        return Optional.empty();
    }

    @Override
    public Iterable<Customer> findAll() {
        return null;
    }

    @Override
    public void deleteById(long l) {

    }
}
