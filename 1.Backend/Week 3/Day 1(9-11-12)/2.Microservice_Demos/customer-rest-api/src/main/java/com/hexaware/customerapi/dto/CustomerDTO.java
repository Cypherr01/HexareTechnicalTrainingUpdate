package com.hexaware.customerapi.dto;

import java.time.LocalDate;

public class CustomerDTO {

	private int customerId;
	private String customerName;
	private LocalDate dateOfBirth;

	private int productId;

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(int customerId, String customerName, LocalDate dateOfBirth, int productId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.productId = productId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public int getProductId() {
		return productId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

}
