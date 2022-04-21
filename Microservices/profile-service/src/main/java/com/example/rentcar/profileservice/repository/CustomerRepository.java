package com.example.rentcar.profileservice.repository;

import com.example.rentcar.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
