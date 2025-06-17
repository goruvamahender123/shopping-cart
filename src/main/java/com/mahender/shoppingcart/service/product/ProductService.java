package com.mahender.shoppingcart.service.product;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mahender.shoppingcart.exceptions.ProductNotFoundException;
import com.mahender.shoppingcart.model.Category;
import com.mahender.shoppingcart.model.Product;
import com.mahender.shoppingcart.repository.CategoryRepository;
import com.mahender.shoppingcart.repository.ProductRepository;
import com.mahender.shoppingcart.request.AddProduct;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;

	@Override
	public Product addProduct(AddProduct product) {
		//If already category is already present Add product that's it
		//If category is not present then get the product category from request and save the product.
		Category category = Optional.ofNullable(categoryRepository.findByName(product.getCategory().getName()))
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
		productRepository.findById(id).ifPresentOrElse(productRepository::delete, () -> {
			throw new ProductNotFoundException("Product Not Found!");
		});
	}

	@Override
	public List<Product> getProductsByBrand(String brand) {

		return productRepository.findByName(brand);
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
	public List<Product> getProductsByCategoryAndBrand(String category, String brand) {

		return productRepository.findByCategoryNameAndBrand(category, brand);
	}

	@Override
	public List<Product> getProductsByName(String name) {

		return productRepository.findByProductName(name);
	}

	@Override
	public List<Product> getProductsByNameAndBrand(String name, String brand) {

		return productRepository.findByProductNameAndBrand(name, brand);
	}

	@Override
	public Long countByBrandAndName(String name, String brand) {

		return productRepository.count(name, brand);
	}

	private Product createProduct(AddProduct request, Category category) {
		return new Product(request.getName(), request.getBrand(), request.getDescription(), request.getPrice(),
				request.getInventory(), request.getCategory());
	}

}
