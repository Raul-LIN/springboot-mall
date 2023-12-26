package com.Tank.springbootmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Tank.springbootmall.dao.ProductDao;
import com.Tank.springbootmall.model.Product;
import com.Tank.springbootmall.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public Product getProductById(Integer productId) {
		return productDao.getProductById(productId);
	}

	
}
