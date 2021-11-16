package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	@GetMapping("/show")
	public String getProduct() {
		return "Shirt";
	}
}
