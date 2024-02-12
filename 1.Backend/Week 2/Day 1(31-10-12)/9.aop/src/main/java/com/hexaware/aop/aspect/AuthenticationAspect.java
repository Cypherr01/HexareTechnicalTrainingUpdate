package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.login())")
	public void authentication() { // pointcut-1
		
		
	}

	@Pointcut("execution(* com.hexaware.aop.service.BankService.*())")
	public void authorization() {  // pointcut-2

		
		
	}
	
	
	@Before("authentication() ||  authorization()")
	public void   authenticationAuthorization() { // join point
		
		System.out.println("User Login verified with authentication and authorization");
		
	}
	
	
	
	
	
	

}
