package com.ricky.rent.customerservice.service;

import com.ricky.rent.rentmodel.customer.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    Customer findById(int id);
    List<Customer> findAll();
}
