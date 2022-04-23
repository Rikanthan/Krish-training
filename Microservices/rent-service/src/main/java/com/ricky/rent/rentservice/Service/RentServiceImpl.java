package com.ricky.rent.rentservice.Service;

import com.netflix.hystrix.HystrixCommand;
import com.ricky.rent.rentmodel.customer.Customer;
import com.ricky.rent.rentmodel.rent.Rent;
import com.ricky.rent.rentmodel.vehicle.Vehicle;
import com.ricky.rent.rentservice.Repository.RentRepository;
import com.ricky.rent.rentservice.hystrix.CommonHystrixCommand;
import com.ricky.rent.rentservice.hystrix.VehicleHystrix;
import com.ricky.rent.rentservice.model.DetailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class RentServiceImpl implements RentService{
    @Autowired
    RentRepository rentRepository;

    @Autowired
    HystrixCommand.Setter setter;
    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
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
    public DetailResponse findDetailsResponse(int id) throws ExecutionException, InterruptedException{
        Rent rent = findById(id);
        Customer customer = getCustomer(rent.getCustomerId());
        Vehicle vehicle = getVehicle(rent.getVehicleId());
        return new DetailResponse(rent,customer,vehicle);
    }
    private Customer getCustomer(int customerId) throws ExecutionException, InterruptedException{
        CommonHystrixCommand<Customer> customerCommonHysctrixCommand=new CommonHystrixCommand<Customer>(
                setter,()->
        {
            return restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
        },()->{
            return new Customer();
        });

        Future<Customer> customerFuture=customerCommonHysctrixCommand.queue();
        return customerFuture.get();
    }
    private Vehicle getVehicle(int vehicleId){

        VehicleHystrix vehicleCommand= new VehicleHystrix(restTemplate,vehicleId);
        return vehicleCommand.execute();
    }
}
