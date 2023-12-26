package com.Tank.springbootmall.dao;

import com.Tank.springbootmall.model.Product;

public interface ProductDao {
	
	Product getProductById(Integer productId);
}
