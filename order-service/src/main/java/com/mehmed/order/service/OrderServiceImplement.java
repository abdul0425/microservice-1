package com.mehmed.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.order.dto.OrderDto;
import com.mehmed.order.dto.OrderLineItemsDto;
import com.mehmed.order.model.OrderLineItems;
import com.mehmed.order.model.OrderModel;
import com.mehmed.order.repository.OrderRepo;

@Service
public class OrderServiceImplement implements OrderService {

	@Autowired
	private OrderRepo orderRepo;
	
	
	
	@Override
	public OrderModel placeOrder(OrderDto orderDto) {
		// TODO Auto-generated method stub
		OrderModel model = new OrderModel();
		model.setOrderNumber(UUID.randomUUID().toString());
		model.setOrderLineItems(processOrderLineItems(orderDto.getOrderLineItemsDto()));

		OrderModel orderModel = orderRepo.save(model);
		return orderModel;
	}

	private List<OrderLineItems> processOrderLineItems(List<OrderLineItemsDto> orderLineItemsDtoList) {
		List<OrderLineItems> lineItems = new ArrayList<>();

		orderLineItemsDtoList.stream().forEach(orderLineItemDto -> {
			OrderLineItems orderLineItems = new OrderLineItems();
			orderLineItems.setSkuCode(orderLineItemDto.getSkuCode());
			orderLineItems.setQuantity(orderLineItemDto.getQuantity());
			orderLineItems.setPrice(orderLineItemDto.getPrice());

			lineItems.add(orderLineItems);

		});
		return lineItems;
	}

}
