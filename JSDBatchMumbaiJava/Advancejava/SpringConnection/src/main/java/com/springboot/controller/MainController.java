package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping
	public String display() {
		System.out.println("This is my home page");
		return "home";
	}
}
