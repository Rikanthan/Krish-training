package com.example.rentcar.profileservice.service;
import com.example.rentcar.Customer;
import java.util.List;
public interface CustomerService {
    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
