package com.example.rentcar;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name ="vehicle")
public class Vehicle {
    @Id
    @GeneratedValue
    int id;
    String make;
    String model;
    String type;
    int year;
}
