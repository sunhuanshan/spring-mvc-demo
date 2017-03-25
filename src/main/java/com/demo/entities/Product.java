package com.demo.entities;

import java.math.BigDecimal;

import com.demo.base.BaseEntity;

public class Product extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 售价
	 */
	private BigDecimal price;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Product(){
		
	}
}
