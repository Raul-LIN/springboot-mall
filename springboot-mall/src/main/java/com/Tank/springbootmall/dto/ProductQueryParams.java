package com.Tank.springbootmall.dto;

import com.Tank.springbootmall.constant.ProductCategory;

public class ProductQueryParams {
	
	private ProductCategory category;
	private String searchString;
	private String orderBy;
	private String sort;
	
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
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
	
}
