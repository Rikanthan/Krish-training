package com.rentcar.rentprocess;

import com.rentcar.rentprocess.service.TaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class RentprocessApplication {

	@Bean
	TaskRunner getTaskRunner(){
		return new TaskRunner();
	}
	public static void main(String[] args) {
		SpringApplication.run(RentprocessApplication.class, args);
	}

}
