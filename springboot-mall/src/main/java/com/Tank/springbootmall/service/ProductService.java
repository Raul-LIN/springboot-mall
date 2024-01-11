package com.Tank.springbootmall.service;

import javax.validation.Valid;

import com.Tank.springbootmall.dto.ProductRequest;
import com.Tank.springbootmall.model.Product;

public interface ProductService {

	Product getProductById(Integer productId);

	Integer createProduct(@Valid ProductRequest productRequest);
}
