package com.smc.service;

import com.smc.entity.CustomerEntityInterface;
import com.smc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerEntityInterface customerEntity;

    public void save(Customer customer) {
        customerEntity.save(customer);
    }

    public List<Customer> listAll() {
        return (List<Customer>) customerEntity.findAll();
    }

    public Customer get(Long id){
        return customerEntity.findById(id).get();
    }

}
