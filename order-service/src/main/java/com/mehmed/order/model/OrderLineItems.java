package com.mehmed.order.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mehmed.order.constant.AppConstant;

import lombok.Data;

@Data
@Entity
@Table(name = AppConstant.ORDER_LINE_ITEMS)
public class OrderLineItems implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderLineId;
	private String skuCode;
	private Double price;
	private Integer quantity;
	
	
	

}
