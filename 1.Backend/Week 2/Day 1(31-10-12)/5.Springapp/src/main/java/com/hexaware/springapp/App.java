package com.hexaware.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexaware.springapp.beans.Product;
import com.hexaware.springapp.service.IProductService;
import com.hexaware.springapp.service.ProductServiceImp;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.hexaware.springapp"})
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Presentation Layer UI" );
        
        		ApplicationContext container = new AnnotationConfigApplicationContext(App.class);
        		
        		IProductService  service =	container.getBean(ProductServiceImp.class);
        		
        			Product product =	service.getProduct();
        			
        				System.out.println(product);
        			
        		
        
    }
}
