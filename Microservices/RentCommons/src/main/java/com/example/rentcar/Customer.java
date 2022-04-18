package com.example.rentcar;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    int id;
    String name;
    String address;
    String dlNo;
    String zipcode;
}
