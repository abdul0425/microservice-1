package com.mehmed.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mehmed.inventory.constant.AppConstant;

import lombok.Data;


@Data
@Entity
@Table(name = AppConstant.TABLE)
public class InventoryModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer inventoryId;
	private String skuCode;
	private Integer quantity;
}
