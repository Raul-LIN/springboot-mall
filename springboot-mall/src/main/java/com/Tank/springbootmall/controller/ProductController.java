package com.Tank.springbootmall.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Tank.springbootmall.constant.ProductCategory;
import com.Tank.springbootmall.dto.ProductQueryParams;
import com.Tank.springbootmall.dto.ProductRequest;
import com.Tank.springbootmall.model.Product;
import com.Tank.springbootmall.service.ProductService;
import com.Tank.springbootmall.util.Page;

@Validated		//	@Min、@Min才會生效
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<Page<Product>>getProduct(
			//	查詢條件	Filtering
			@RequestParam(required = false) ProductCategory category,
			@RequestParam(required = false) String search,
			
			//	排序	Sorting
			@RequestParam(defaultValue = "created_date") String orderBy,
			@RequestParam(defaultValue = "desc") String sort,
			
			//	分頁	Pagination
			@RequestParam(defaultValue = "5") @Max(1000) @Min(0) Integer limit,		//	取得幾筆商品資訊
			@RequestParam(defaultValue = "0") @Min(0) Integer offset		//	跳過幾筆商品資訊
	){
		ProductQueryParams productQueryParams = new ProductQueryParams();
		productQueryParams.setCategory(category);
		productQueryParams.setSearchString(search);
		productQueryParams.setOrderBy(orderBy);
		productQueryParams.setSort(sort);
		productQueryParams.setLimit(limit);
		productQueryParams.setOffset(offset);
		
		//	取得 product list
		List<Product> productList = productService.getPoducts(productQueryParams);
		
		//	取得 product 總數
		Integer total = productService.countProduct(productQueryParams);
		
		//	分頁
		Page<Product> page = new Page<>();
		page.setLimit(limit);
		page.setOffset(offset);
		page.setTotal(total);
		page.setResult(productList);
		
		return ResponseEntity.status(HttpStatus.OK).body(page);
	}
	
	@GetMapping("/products/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer productId){
		Product product = productService.getProductById(productId);
		
		if(product != null) {
			return ResponseEntity.status(HttpStatus.OK).body(product);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest){
		Integer productId =  productService.createProduct(productRequest);
		
		Product product = productService.getProductById(productId);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}
	
	@PutMapping("/products/{productId}")
	public ResponseEntity<Product>updateProduct(@PathVariable Integer productId, 
																					@RequestBody @Valid  ProductRequest productRequest){
		 //	檢查 product 是否存在
		Product product = productService.getProductById(productId);
		if(product == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		//	修改商品數據
		productService.updateProduct(productId, productRequest);
		
		Product updateProduct = productService.getProductById(productId);
		
		return ResponseEntity.status(HttpStatus.OK).body(updateProduct);
	}
	
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<?> deletetProduct(@PathVariable Integer productId){
		productService.deleteProductById(productId);
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
