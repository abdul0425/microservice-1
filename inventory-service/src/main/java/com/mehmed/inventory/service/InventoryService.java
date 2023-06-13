package com.mehmed.inventory.service;

import java.util.List;

import com.mehmed.inventory.model.InventoryModel;

public interface InventoryService {

	Boolean isInStock(String skuCode);

	InventoryModel fillStock(InventoryModel inventoryModel);

	List<InventoryModel> stockList();

}
