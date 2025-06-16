package com.mahender.shoppingcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahender.shoppingcart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByCategoryName(String category);

	List<Product> findByCategoryNameAndBrand(String category, String brand);
	
	List<Product> findByProductName(String name);

	List<Product> findByProductNameAndBrand(String name, String brand);

	List<Product> findByName(String brand);

	Long count(String name, String brand);

}
