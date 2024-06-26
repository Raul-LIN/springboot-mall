package com.Tank.springbootmall.dao;

import java.util.List;

import javax.validation.Valid;

import com.Tank.springbootmall.dto.ProductQueryParams;
import com.Tank.springbootmall.dto.ProductRequest;
import com.Tank.springbootmall.model.Product;

public interface ProductDao {
	
	Integer countProduct(ProductQueryParams productQueryParams);
	
	List<Product> getProducts(ProductQueryParams productQueryParams);
	
	Product getProductById(Integer productId);

	Integer createProduct(@Valid ProductRequest productRequest);

	void updateProduct(Integer productId, ProductRequest productRequest);

	void updateStock(Integer productId, Integer stock);

	void deleteProductById(Integer productId);

	

	
}
