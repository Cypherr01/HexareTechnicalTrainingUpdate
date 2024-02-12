package com.hexaware.restapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restapi.dto.ProductDTO;
import com.hexaware.restapi.entity.Product;
import com.hexaware.restapi.service.IProductService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	@Autowired
	IProductService service;
	
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody ProductDTO productDTO) {
		
		return service.addProduct(productDTO);
	}

	
	@GetMapping("/get/{pid}")
	public ProductDTO getById(@PathVariable @Valid @Min(1)   int pid) {
		
		return service.getById(pid);
	}


		@GetMapping("/getall")
	public List<Product> getAllProducts() {
	
		return service.getAllProducts();
	}

	
	

}
