package com.hexaware.customerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexaware.customerapi.dto.CustomerDTO;
import com.hexaware.customerapi.dto.CustomerProductVO;
import com.hexaware.customerapi.dto.ProductDTO;
import com.hexaware.customerapi.entity.Customer;
import com.hexaware.customerapi.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements ICustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	RestTemplate restTemplate;
	

	@Override
	public Customer addCustomer(CustomerDTO customerDTO) {

		Customer customer = new Customer();

		customer.setCustomerId(customerDTO.getCustomerId());
		customer.setCustomerName(customerDTO.getCustomerName());
		customer.setDateOfBirth(customerDTO.getDateOfBirth());
		customer.setProductId(customerDTO.getProductId());

		return customerRepo.save(customer);
	}

	@Override
	public CustomerDTO getCustomerById(int customerId) {

		
		Customer customer =	customerRepo.findById(customerId).orElse(new Customer());


		return new CustomerDTO(customer.getCustomerId(), customer.getCustomerName(), customer.getDateOfBirth(), customer.getProductId());
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAll(Sort.by("customerName"));
	}

	@Override
	public CustomerProductVO getCustomerAndProductById(int customerId) {

	CustomerDTO  customerDTO =	getCustomerById(customerId);
			
				int pid =	customerDTO.getProductId();
	
	ProductDTO productDTO =	restTemplate.getForObject("http://localhost:8282/api/products/get/"+pid, ProductDTO.class);
		
		CustomerProductVO  customerAndProduct = new CustomerProductVO();
	
			customerAndProduct.setCustomer(customerDTO);
			customerAndProduct.setProduct(productDTO);
		
		return customerAndProduct;
	}

}
