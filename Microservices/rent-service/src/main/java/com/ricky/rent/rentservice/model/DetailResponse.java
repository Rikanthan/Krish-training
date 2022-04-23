package com.ricky.rent.rentservice.model;


import com.ricky.rent.rentmodel.customer.Customer;
import com.ricky.rent.rentmodel.rent.Rent;
import com.ricky.rent.rentmodel.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DetailResponse implements Response{
    Rent rent;
    Customer customer;
    Vehicle vehicle;

    public DetailResponse(Rent rent,Customer customer,Vehicle vehicle)
    {
        this.rent = rent;
        this.customer = customer;
        this.vehicle = vehicle;
    }

}
