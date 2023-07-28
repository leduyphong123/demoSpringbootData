package com.codegym.service.impl;

import com.codegym.entity.Customer;
import com.codegym.repository.CustomerRepository;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customer")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> getAll() {
        return (List<Customer>) customerRepository.findAll();
    }
}
