package com.Tank.springbootmall.dao;

import javax.validation.Valid;

import com.Tank.springbootmall.dto.ProductRequest;
import com.Tank.springbootmall.model.Product;

public interface ProductDao {
	
	Product getProductById(Integer productId);

	Integer createProduct(@Valid ProductRequest productRequest);
}
