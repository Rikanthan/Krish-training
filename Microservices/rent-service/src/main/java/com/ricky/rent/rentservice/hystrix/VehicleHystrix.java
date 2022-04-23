package com.ricky.rent.rentservice.hystrix;


import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.ricky.rent.rentmodel.vehicle.Vehicle;
import org.springframework.web.client.RestTemplate;

public class VehicleHystrix extends HystrixCommand<Vehicle> {
    RestTemplate restTemplate;
    int vehicleId;



    public VehicleHystrix(RestTemplate restTemplate, int vehicleId){

        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.restTemplate=restTemplate;
        this.vehicleId=vehicleId;
    }

    @Override
    protected Vehicle run() throws Exception {
        return restTemplate.getForObject("http://vehicle/services/vehicles/"+vehicleId,Vehicle.class);
    }

    @Override
    protected Vehicle getFallback() {
        System.out.println("hit on fallback");
        return new Vehicle();
    }
}
