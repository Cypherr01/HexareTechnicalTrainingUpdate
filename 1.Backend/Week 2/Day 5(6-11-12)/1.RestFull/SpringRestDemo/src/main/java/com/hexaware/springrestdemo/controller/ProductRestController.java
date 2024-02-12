package com.hexaware.springrestdemo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestdemo.entity.Product;
import com.hexaware.springrestdemo.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	
	@Autowired
	IProductService  productService;

	@GetMapping("/getall")
	public Set<Product> getAllProducts() { // resource or rest api or end-point

		return  productService.getAllProducts();

	}

	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {

		return   productService.addProduct(product);

	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {

		return   productService.updateProduct(product);

	}
	
	
	@DeleteMapping("/delete/{pid}")
	public String  deleteProduct(@PathVariable int pid) {
		
		
			productService.deleteProductById(pid);
		
		return "Product Deleted";
		
	}
	
	@GetMapping("/get/{pid}")         // here {pid} indicates path variable
	public  Product   getProductById(@PathVariable int pid) {
		
		
		return productService.getByProductId(pid);
		
	}
	
	
	
	
	

}
