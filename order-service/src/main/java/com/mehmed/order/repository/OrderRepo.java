package com.mehmed.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.order.model.OrderModel;

public interface OrderRepo extends JpaRepository<OrderModel, Integer> {

}
