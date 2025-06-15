package com.mahender.shoppingcart.service.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mahender.shoppingcart.exceptions.ProductNotFoundException;
import com.mahender.shoppingcart.model.Product;
import com.mahender.shoppingcart.repository.ProductRepository;

@Service
public class ProductService implements IProductService {

	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		return null;
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product Not Found!"));
	}

	@Override
	public void updateProductById(Long id) {

	}

	@Override
	public void deleteProductById(Long id) {
		productRepository.findById(id).ifPresentOrElse(productRepository::delete, () -> {throw new ProductNotFoundException("Product Not Found!");});
	}

	@Override
	public List<Product> getProductsByBrand(String brand) {

		return null;
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		return productRepository.findByCategoryName(category);
	}

	@Override
	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}

	@Override
	public List<Product> getProductsByCategoryAndBrand(String brand, String category) {

		return null;
	}

	@Override
	public List<Product> getProductsByName(String name) {

		return null;
	}

	@Override
	public List<Product> getProductsByNameAndBrand(String name, String brand) {

		return null;
	}

	@Override
	public Long countByBrandAndName(String name, String brand) {

		return null;
	}

}
