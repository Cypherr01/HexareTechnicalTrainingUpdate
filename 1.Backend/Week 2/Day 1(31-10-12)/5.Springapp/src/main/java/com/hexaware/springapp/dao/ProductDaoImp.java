package com.hexaware.springapp.dao;

import org.springframework.stereotype.Repository;

import com.hexaware.springapp.beans.Product;

@Repository
public class ProductDaoImp implements IProductDAO {
	
	@Override
	public Product getProduct() {

		// any DB Connectivity logics like JDBC,Hibernate,JPA etc..

		return new Product(101, "Mobile", 45000); // it is record coming from DB in realtime
	}

}
