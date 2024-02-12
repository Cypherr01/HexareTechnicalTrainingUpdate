package com.hexaware.auth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

		@GetMapping("/")
		public String home() {  // not secured
			
			return "Welcome to Home";
			
		}
	
		@GetMapping("/secured")
		public String secured() {
			
			return "This is Secured Service";
			
		}
		
		
		
}
