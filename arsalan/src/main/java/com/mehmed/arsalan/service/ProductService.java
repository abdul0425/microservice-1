package com.mehmed.arsalan.service;

import java.util.List;

import com.mehmed.arsalan.dto.ProductDto;
import com.mehmed.arsalan.model.ProductModel;

public interface ProductService {

	ProductModel createProduct(ProductDto dto);

	List<ProductModel> getProductList();

}
