package com.example.rentcar.profileservice.controller;


import com.example.rentcar.profileservice.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.example.rentcar.Customer;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/services", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer)
    {
        return customerService.save(customer);
    }

    @RequestMapping(value = "/services/{id}", method = RequestMethod.GET)
    public Customer fetch(@PathVariable(value = "id") int profileId)
    {
        return customerService.fetchById(profileId);
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_admin')")
    public List<Customer> fetch()
    {
        return customerService.fetchAllProfiles();
    }
}
