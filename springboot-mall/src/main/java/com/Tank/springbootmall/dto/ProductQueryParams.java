package com.Tank.springbootmall.dto;

import com.Tank.springbootmall.constant.ProductCategory;

public class ProductQueryParams {
	
	private ProductCategory category;
	private String searchString;
	
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	
	
}
