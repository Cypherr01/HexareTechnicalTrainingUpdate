package com.hexaware.customerapi.dto;

public class CustomerProductVO {
	
	private CustomerDTO customer;
	private ProductDTO product;
	
	
	public CustomerProductVO() {
		super();
	}
	public CustomerProductVO(CustomerDTO customer, ProductDTO product) {
		super();
		this.customer = customer;
		this.product = product;
	}
	public CustomerDTO getCustomer() {
		return customer;
	}
	public ProductDTO getProduct() {
		return product;
	}
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	
	
	
	

}
