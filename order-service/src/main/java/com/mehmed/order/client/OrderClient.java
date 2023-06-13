package com.mehmed.order.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.mehmed.order.model.ProductModel;

@FeignClient(value = "PRODUCT-SERVICE",url = "http://localhost:8080/api-product")
public interface OrderClient {

	@GetMapping(value = "/productList")
	public List<ProductModel> getAllProducts();
}
