package com.ricky.rent.rentservice.controller;

import com.ricky.rent.rentmodel.rent.Rent;
import com.ricky.rent.rentservice.Service.RentService;
import com.ricky.rent.rentservice.model.Response;
import com.ricky.rent.rentservice.model.SimpleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/services/rents")
public class RentController {
    @Autowired
    RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Response getRent(@PathVariable int id, @RequestParam(required = false) String type) {

        if(type==null){
            return  new SimpleResponse(rentService.findById(id));
        }else{
            return  rentService.findDetailsResponse(id);
        }



    }

    @GetMapping
    public List<Rent> getAllRents() {
        return rentService.findAll();
    }
}
