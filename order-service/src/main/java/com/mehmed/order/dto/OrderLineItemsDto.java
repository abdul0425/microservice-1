package com.mehmed.order.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class OrderLineItemsDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String skuCode;
	private Double price;
	private Integer quantity;

}
