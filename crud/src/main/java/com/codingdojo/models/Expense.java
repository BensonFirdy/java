package com.codingdojo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Expense {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotNull(message="Name is required!")
	@Size(min=8,max=255,message="Expense name should be between 8-255 characters.")
	private String name;
	
	@NotNull(message="Vendor is required!")
	@Size(min=8,max=255,message="Vendor name should be between 8-255 characters.")
	private String vendor;
	
	@NotNull(message="Amount is required!")
	@Min(value=1,message="Must be greater than $1.")
	@Max(value=500,message="Must be less than $500.")
	private Integer amount;
	
	@NotNull(message="Description is required!")
	@Size(min=8,max=255,message="Description should be between 8-255 characters.")
	private String description;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Expense() {
		
	}
}
