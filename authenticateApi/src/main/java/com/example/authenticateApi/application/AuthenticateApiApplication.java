package com.example.authenticateApi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class AuthenticateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticateApiApplication.class, args);
	}

}
