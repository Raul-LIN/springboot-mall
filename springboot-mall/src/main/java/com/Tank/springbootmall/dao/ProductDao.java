package com.Tank.springbootmall.dao;

import java.util.List;

import javax.validation.Valid;

import com.Tank.springbootmall.dto.ProductRequest;
import com.Tank.springbootmall.model.Product;

public interface ProductDao {
	
	List<Product> getProducts();
	
	Product getProductById(Integer productId);

	Integer createProduct(@Valid ProductRequest productRequest);

	void updateProduct(Integer productId, ProductRequest productRequest);

	void deleteProductById(Integer productId);

	

	
}
