package com.Tank.springbootmall.service;

import java.util.List;

import javax.validation.Valid;

import com.Tank.springbootmall.constant.ProductCategory;
import com.Tank.springbootmall.dto.ProductRequest;
import com.Tank.springbootmall.model.Product;

public interface ProductService {

	List<Product> getPoducts(ProductCategory category, String search);
	
	Product getProductById(Integer productId);

	Integer createProduct(@Valid ProductRequest productRequest);

	void updateProduct(Integer productId, @Valid ProductRequest productRequest);

	void deleteProductById(Integer productId);
}
