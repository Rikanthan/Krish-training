package com.ricky.rent.vehicleservice.service;

import com.ricky.rent.rentmodel.vehicle.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle save(Vehicle vehicle);
    Vehicle findById(int id);
    List<Vehicle> findAll();
}
