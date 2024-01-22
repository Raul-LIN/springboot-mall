package com.Tank.springbootmall.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.Tank.springbootmall.dao.ProductDao;
import com.Tank.springbootmall.dto.ProductQueryParams;
import com.Tank.springbootmall.dto.ProductRequest;
import com.Tank.springbootmall.model.Product;
import com.Tank.springbootmall.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getPoducts(ProductQueryParams productQueryParams) {
		return productDao.getProducts(productQueryParams);
	}
	
	@Override
	public Product getProductById(Integer productId) {
		return productDao.getProductById(productId);
	}

	@Override
	public Integer createProduct(@Valid ProductRequest productRequest) {
		// TODO Auto-generated method stub
		return productDao.createProduct(productRequest);
	}

	@Override
	public void updateProduct(Integer productId, ProductRequest productRequest) {
		// TODO Auto-generated method stub
		productDao.updateProduct(productId, productRequest);
	}

	@Override
	public void deleteProductById(Integer productId) {
		// TODO Auto-generated method stub
		productDao.deleteProductById(productId);
	}



	

	
	
}
