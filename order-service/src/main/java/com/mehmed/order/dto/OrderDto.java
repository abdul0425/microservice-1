package com.mehmed.order.dto;

import java.io.Serializable;
import java.util.List;


import lombok.Data;

@Data
public class OrderDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<OrderLineItemsDto> orderLineItemsDto;
}
