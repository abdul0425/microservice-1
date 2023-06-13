package com.mehmed.arsalan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.arsalan.dto.ProductDto;
import com.mehmed.arsalan.model.ProductModel;
import com.mehmed.arsalan.repository.ProductRepo;

@Service
public class ProductServiceImplement implements ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	
	@Override
	public ProductModel createProduct(ProductDto dto) {
		// TODO Auto-generated method stub
		ProductModel model = new ProductModel();
		model.setProductName(dto.getProductName());
		model.setBrand(dto.getBrand());
		model.setCost(dto.getCost());
		model.setDescription(dto.getDescription());
		
		ProductModel productModel = productRepo.save(model);
		
		return productModel;
	}

	@Override
	public List<ProductModel> getProductList() {
		// TODO Auto-generated method stub
		List<ProductModel> list = productRepo.findAll();
		return list;
	}

}
