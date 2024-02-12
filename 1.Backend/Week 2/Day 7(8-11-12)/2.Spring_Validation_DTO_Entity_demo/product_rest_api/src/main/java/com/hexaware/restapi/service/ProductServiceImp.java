package com.hexaware.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restapi.dto.ProductDTO;
import com.hexaware.restapi.entity.Product;
import com.hexaware.restapi.repository.ProductRepository;

@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	ProductRepository repo;

	@Override
	public Product addProduct(ProductDTO productDTO) {

		Product product = new Product(); // entity class obj

		product.setPname(productDTO.getPname());
		product.setPrice(productDTO.getPrice());

		return repo.save(product);
	}

	@Override
	public ProductDTO getById(int pid) {

		Product product = repo.findById(pid).orElse(null);

		ProductDTO productDTO = new ProductDTO();

					productDTO.setPid(product.getPid());
					productDTO.setPname(product.getPname());
					productDTO.setPrice(product.getPrice());
			
		
		return  productDTO;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
