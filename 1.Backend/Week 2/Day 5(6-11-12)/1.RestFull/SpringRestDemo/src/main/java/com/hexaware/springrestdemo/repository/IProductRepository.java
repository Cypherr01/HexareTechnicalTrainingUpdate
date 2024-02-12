package com.hexaware.springrestdemo.repository;

import java.util.Set;

import com.hexaware.springrestdemo.entity.Product;

public interface IProductRepository {
	
	
	public Product addProduct(Product product);
	public Product updateProduct(Product product);

	public Product getByProductId(int productId);
	public void deleteProductById(int productId);
	
	
	public   Set<Product>   getAllProducts();
		
	

}
