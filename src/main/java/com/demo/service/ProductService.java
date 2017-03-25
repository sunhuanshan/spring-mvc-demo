package com.demo.service;

import java.util.List;

import com.demo.entities.Product;
public interface ProductService {
	/**
	 * 获取所有的商品
	 * @return
	 */
	public List<Product> getProducts();
	
	/**
	 * 获取商品
	 * @param id
	 * @return
	 */
	public Product getProduct(Integer id);
	
}
