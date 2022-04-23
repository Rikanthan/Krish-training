package com.ricky.rent.rentservice.Service;

import com.ricky.rent.rentmodel.customer.Customer;
import com.ricky.rent.rentmodel.rent.Rent;
import com.ricky.rent.rentmodel.vehicle.Vehicle;
import com.ricky.rent.rentservice.Repository.RentRepository;
import com.ricky.rent.rentservice.model.DetailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class RentServiceImpl implements RentService{
    @Autowired
    RentRepository rentRepository;

    @Autowired
    RestTemplate restTemplate;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder)
    {
        return builder.build();
    }
    @Override
    public Rent save(Rent rent) {
        return rentRepository.save(rent);
    }

    @Override
    public Rent findById(int id) {
        Optional<Rent> rent = rentRepository.findById(id);
        if(rent.isPresent())
        {
            return rent.get();
        }
        else
            return new Rent();
    }

    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    @Override
    public DetailResponse findDetailsResponse(int id) {
        Rent rent = findById(id);
        Customer customer = getCustomer(rent.getCustomerId());
        Vehicle vehicle = getVehicle(rent.getVehicleId());
        return null;
    }
    private Customer getCustomer(int customerId){
        Customer customer = restTemplate.getForObject("http://localhost:8080/services/customers/",
                Customer.class,customerId);
        return customer;
    }
    private Vehicle getVehicle(int vehicleId){
        return restTemplate.getForObject("http://localhost:9191/services/vehicles/",Vehicle.class,vehicleId);
    }
}
