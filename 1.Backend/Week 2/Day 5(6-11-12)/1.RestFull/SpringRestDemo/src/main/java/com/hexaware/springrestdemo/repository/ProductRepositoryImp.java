package com.hexaware.springrestdemo.repository;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.hexaware.springrestdemo.entity.Product;

@Repository
public class ProductRepositoryImp implements IProductRepository {

	Set<Product> productSet = new HashSet<Product>();

	@Override
	public Product addProduct(Product product) {

		productSet.add(product);

		return product;

	}

	@Override
	public Product updateProduct(Product product) {

		productSet.add(product);

		return product;
	}

	@Override
	public Product getByProductId(int productId) {

		Product product1 = null;

		for (Product product : productSet) {

			if (product.getProductId() == productId) {

				product1 = product;

			}

		}

		return product1;
	}

	@Override
	public void deleteProductById(int productId) {

		for (Product product : productSet) {

			if (product.getProductId() == productId) {

				productSet.remove(product);
				System.out.println("Product Removed for Pid: " + productId);

			}

		}

	}

	@Override
	public Set<Product> getAllProducts() {

		return productSet;
	}

}
