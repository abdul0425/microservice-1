package com.mehmed.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.order.client.OrderClient;
import com.mehmed.order.constant.AppConstant;
import com.mehmed.order.dto.OrderDto;
import com.mehmed.order.model.OrderModel;
import com.mehmed.order.model.ProductModel;
import com.mehmed.order.service.OrderService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = AppConstant.API)
@Slf4j
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderClient orderClient;

	@PostMapping(value = AppConstant.ORDER)
	public ResponseEntity<OrderModel> placeOrder(@RequestBody OrderDto orderDto){
		log.info("Inside place order : {} "+orderDto);
		return new ResponseEntity<OrderModel>(orderService.placeOrder(orderDto), HttpStatus.CREATED);
	}
	
	@GetMapping(value = AppConstant.GET_PRODUCTS_LIST)
	public @ResponseBody List<ProductModel> getAllProducts(){
		return orderClient.getAllProducts();
	}
}
