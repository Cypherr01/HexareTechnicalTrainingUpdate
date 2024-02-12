package com.hexaware.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbc.dao.IProductDAO;
import com.hexaware.springjdbc.model.Product;

@Service
public class ProductServiceImp implements IProductService {

	
	@Autowired
	IProductDAO dao;
	
	@Override
	public boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.createProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(pid);
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return dao.getProductById(pid);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

}
