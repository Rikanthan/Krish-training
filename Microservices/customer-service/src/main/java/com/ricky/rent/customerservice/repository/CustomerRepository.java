package com.ricky.rent.customerservice.repository;

import com.ricky.rent.rentmodel.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
