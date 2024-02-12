package com.hexaware.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.springboot1.entity.Employee;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] ar) {
	ApplicationContext context =	SpringApplication.run(Springboot1Application.class, ar);
	
		Employee  emp =		context.getBean(Employee.class);
	
			System.out.println(emp);
	}

}
