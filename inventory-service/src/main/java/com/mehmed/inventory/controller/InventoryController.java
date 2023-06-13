package com.mehmed.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.inventory.constant.AppConstant;
import com.mehmed.inventory.model.InventoryModel;
import com.mehmed.inventory.service.InventoryService;

@RestController
@RequestMapping(value = AppConstant.API)
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	
	@GetMapping(value = AppConstant.IS_IN_STOCK)
	public ResponseEntity<Boolean> isInStock(@PathVariable("skuCode") String skuCode) {
		return new ResponseEntity<Boolean>(inventoryService.isInStock(skuCode), HttpStatus.OK);
	}
	
	@PostMapping(value = AppConstant.FILL_STOCK)
	public ResponseEntity<InventoryModel> fillStock(@RequestBody InventoryModel inventoryModel){
		return new ResponseEntity<InventoryModel>(inventoryService.fillStock(inventoryModel),HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = AppConstant.GET_STOCK)
	public ResponseEntity<List<InventoryModel>> stockList(){
		return new ResponseEntity<List<InventoryModel>>(inventoryService.stockList(), HttpStatus.OK);
	}
	
	
}