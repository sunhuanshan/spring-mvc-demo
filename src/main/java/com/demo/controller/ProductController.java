package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.base.InfoEntity;
import com.demo.entities.Product;
import com.demo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public String list(){
		return "product/list";
	}
	
	@GetMapping("/product")
	@ResponseBody
	public InfoEntity product(@RequestParam(name="pid", required=true)  Integer pid){
		Product pd = productService.getProduct(pid);
		return new InfoEntity(pd);
	}
}
