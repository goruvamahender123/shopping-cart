package com.mahender.shoppingcart.service.product;

import java.util.List;

import com.mahender.shoppingcart.model.Product;
import com.mahender.shoppingcart.request.AddProduct;

public interface IProductService {
	
	Product addProduct(AddProduct product);
	Product getProductById(Long id);
	void updateProductById(Long id);
	void deleteProductById(Long id);
	List<Product> getProductsByBrand(String brand);
	List<Product> getProductsByCategory(String category);
	List<Product> getAllProducts();
	List<Product> getProductsByCategoryAndBrand(String brand, String category);
	List<Product> getProductsByName(String name);
	List<Product> getProductsByNameAndBrand(String name, String brand);
	Long countByBrandAndName(String name, String brand);
	

}
