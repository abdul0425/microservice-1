package com.mehmed.order.service;

import com.mehmed.order.dto.OrderDto;
import com.mehmed.order.model.OrderModel;

public interface OrderService {

	OrderModel placeOrder(OrderDto orderDto);

}
