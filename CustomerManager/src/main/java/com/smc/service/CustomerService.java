package com.smc.service;

import com.smc.entity.CustomerEntity;
import com.smc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerEntity customerEntity;

    public List<Customer> findAll() {
        return (List<Customer>) customerEntity.findAll();
    }
}
