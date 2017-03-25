package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.base.InfoEntity;

@Controller
public class HomeController {
	@RequestMapping("/helloworld")
	public String home(Model model) {
		model.addAttribute("name", "world");
		return "index";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public InfoEntity hello(){
		return new InfoEntity(true, "");
	}
}
