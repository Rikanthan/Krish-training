package com.example.microservices.repository;

import java.util.List;
import java.util.Optional;

import com.example.microservices.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;




public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
	@Query("{name:'?0'}")
	List<Employee> findByName(String name);
}
