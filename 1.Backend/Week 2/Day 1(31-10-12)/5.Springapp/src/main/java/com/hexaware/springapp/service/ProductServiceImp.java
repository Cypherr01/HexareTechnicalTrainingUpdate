package com.hexaware.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springapp.beans.Product;
import com.hexaware.springapp.dao.IProductDAO;

@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	IProductDAO dao;
	
	
	@Override
	public Product getProduct() {
		  // business logics and input validations
		 // we call dao methods
		return dao.getProduct();
	}

}
