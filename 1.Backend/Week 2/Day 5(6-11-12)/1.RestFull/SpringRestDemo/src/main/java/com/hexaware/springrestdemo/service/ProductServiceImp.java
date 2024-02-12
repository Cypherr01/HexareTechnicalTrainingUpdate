package com.hexaware.springrestdemo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestdemo.entity.Product;
import com.hexaware.springrestdemo.repository.IProductRepository;

@Service
public class ProductServiceImp implements IProductService {
	
	
	@Autowired
    IProductRepository repo;
	
	@Override
	public Product addProduct(Product product) {


		return repo.addProduct(product);
	}

	@Override
	public Product updateProduct(Product product) {
	
		return repo.updateProduct(product);
	}

	@Override
	public Product getByProductId(int productId) {
		
		return  repo.getByProductId(productId);
	}

	@Override
	public void deleteProductById(int productId) {
		
				repo.deleteProductById(productId);

	}

	@Override
	public Set<Product> getAllProducts() {
	
		return  repo.getAllProducts();
	}

}
