package com.mehmed.inventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.inventory.model.InventoryModel;
import com.mehmed.inventory.repository.InventoryRepo;

@Service
public class InventoryServiceImplement implements InventoryService {

	@Autowired
	private InventoryRepo inventoryRepo;
	
	
	
	@Override
	public Boolean isInStock(String skuCode) {
		// TODO Auto-generated method stub
		Optional<InventoryModel> optional = inventoryRepo.findBySkuCode(skuCode);
		return optional.isPresent();
	}



	@Override
	public InventoryModel fillStock(InventoryModel inventoryModel) {
		// TODO Auto-generated method stub
		InventoryModel model = inventoryRepo.save(inventoryModel);
		return model;
	}



	@Override
	public List<InventoryModel> stockList() {
		// TODO Auto-generated method stub
		List<InventoryModel> list = inventoryRepo.findAll();
		return list;
	}

}
