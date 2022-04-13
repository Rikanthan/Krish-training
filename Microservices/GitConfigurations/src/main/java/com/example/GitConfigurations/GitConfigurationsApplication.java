package com.example.GitConfigurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GitConfigurationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitConfigurationsApplication.class, args);
	}

}
