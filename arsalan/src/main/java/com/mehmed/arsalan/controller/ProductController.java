package com.mehmed.arsalan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.arsalan.constant.AppConstant;
import com.mehmed.arsalan.dto.ProductDto;
import com.mehmed.arsalan.model.ProductModel;
import com.mehmed.arsalan.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = AppConstant.API)
@Slf4j
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping(value = AppConstant.CREATE)
	public ResponseEntity<ProductModel> createProduct(@RequestBody ProductDto dto){
		log.info("inside create product {} "+dto);
		return new ResponseEntity<ProductModel>(productService.createProduct(dto), HttpStatus.CREATED);
	}
	
	@GetMapping(value = AppConstant.GET_ALL)
	public ResponseEntity<List<ProductModel>> getProductList(){
		log.info("inside get product list {} ");
		return new ResponseEntity<>(productService.getProductList(), HttpStatus.OK);
	}
}
