package com.ricky.rent.vehicleservice.repository;

import com.ricky.rent.rentmodel.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
