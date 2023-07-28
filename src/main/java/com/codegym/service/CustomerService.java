package com.codegym.service;

import com.codegym.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customer")
public interface CustomerService {
    List<Customer> getAll();
}
