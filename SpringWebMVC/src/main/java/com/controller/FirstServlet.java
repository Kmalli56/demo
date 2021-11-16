package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FirstServlet {
	@RequestMapping("/show")
	public String getData(@RequestParam("name") String name, Map<String, String> map) {
		map.put("hcl", name);
		return "view";
	}
}
