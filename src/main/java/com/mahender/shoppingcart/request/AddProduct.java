package com.mahender.shoppingcart.request;

import java.math.BigDecimal;

import com.mahender.shoppingcart.model.Category;

import lombok.Data;

@Data
public class AddProduct {

	private String name;

	private String brand;

	private String description;

	private BigDecimal price;

	private int inventory;
	
	private Category category;
}
