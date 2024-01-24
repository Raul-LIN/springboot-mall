package com.Tank.springbootmall.service;

import java.util.List;

import javax.validation.Valid;

import com.Tank.springbootmall.dto.ProductQueryParams;
import com.Tank.springbootmall.dto.ProductRequest;
import com.Tank.springbootmall.model.Product;

public interface ProductService {

	Integer countProduct(ProductQueryParams productQueryParams);
	
	List<Product> getPoducts(ProductQueryParams productQueryParams);
	
	Product getProductById(Integer productId);

	Integer createProduct(@Valid ProductRequest productRequest);

	void updateProduct(Integer productId, @Valid ProductRequest productRequest);

	void deleteProductById(Integer productId);
}
