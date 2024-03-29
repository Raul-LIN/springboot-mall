package com.Tank.springbootmall.model;

import java.sql.Timestamp;

import com.Tank.springbootmall.constant.ProductCategory;

public class Product {
	
	private Integer productId;
	private String productName;
	private ProductCategory category;
	private String imgeUrl;
	private Integer price;
	private Integer stock;
	private String description;
	private Timestamp createDate;
	private Timestamp ladtModifiedDate;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	public String getImgeUrl() {
		return imgeUrl;
	}
	public void setImgeUrl(String imgeUrl) {
		this.imgeUrl = imgeUrl;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp timestamp) {
		this.createDate = timestamp;
	}
	public Timestamp getLadtModifiedDate() {
		return ladtModifiedDate;
	}
	public void setLadtModifiedDate(Timestamp timestamp) {
		this.ladtModifiedDate = timestamp;
	}

	
	
}
