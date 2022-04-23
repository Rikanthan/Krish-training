package com.ricky.rent.rentservice.model;

import com.ricky.rent.rentmodel.rent.Rent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleResponse implements Response{
    Rent rent;
    public SimpleResponse(Rent rent)
    {
        this.rent = rent;
    }
}
