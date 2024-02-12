package com.hexaware.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;

import com.hexaware.restapi.exception.ProductNotFoundException;

@SpringBootApplication
public class ProductRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRestApiApplication.class, args);
		
	
		
	}

}
