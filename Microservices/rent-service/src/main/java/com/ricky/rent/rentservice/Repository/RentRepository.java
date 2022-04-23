package com.ricky.rent.rentservice.Repository;

import com.ricky.rent.rentmodel.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent,Integer> {
}
