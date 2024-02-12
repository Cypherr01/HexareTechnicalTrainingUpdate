package com.hexa.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexa.springcore.entities.Address;
import com.hexa.springcore.entities.Employee;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "com.hexa.springcore.entities")
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext container = new AnnotationConfigApplicationContext(App.class);

		Address addr = container.getBean(Address.class);
		
			addr.setCity("Hyderabad");
		

		Employee emp = container.getBean(Employee.class);
			
			emp.setEid(101);
			emp.setEname("javeed");
			emp.setAddress(addr);
			
		
		
		
		
		System.out.println(emp);
		

	}
}
