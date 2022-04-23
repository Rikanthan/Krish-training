package com.ricky.rent.rentservice.Service;

import com.ricky.rent.rentmodel.rent.Rent;
import com.ricky.rent.rentservice.model.DetailResponse;

import java.util.List;

public interface RentService {
    Rent save(Rent rent);
    Rent findById(int id);
    List<Rent> findAll();
    DetailResponse findDetailsResponse(int id);
}
