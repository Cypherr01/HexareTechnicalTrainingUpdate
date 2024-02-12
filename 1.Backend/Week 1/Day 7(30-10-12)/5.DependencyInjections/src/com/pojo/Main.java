package com.pojo;

public class Main {

	public static void main(String[] args) {


		/*
		 * Employee emp = new Employee();
		 * 
		 * emp.setEid(101); emp.setEname("Javeed");
		 * 
		 * Address addr = new Address(); addr.setCity("Hyderabad");
		 * 
		 * emp.setAddr(addr); // injecting address obj into emp obj
		 * 
		 * System.out.println(emp);
		 */
		
		
		Address addr = new Address("Pune");
			
		Employee emp = new Employee(102, "Satish", addr);  // DI using constructor
		
		
		System.out.println(emp);
				
				
	}

}
