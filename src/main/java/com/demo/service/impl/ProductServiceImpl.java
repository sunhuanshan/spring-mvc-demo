package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Product;
import com.demo.mapper.ProductMapper;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper prodMapper;
	
	@Override
	public List<Product> getProducts() {
		return null;
	}

	@Override
	public Product getProduct(Integer id) {
		return prodMapper.getProduct(id);
	}

}
