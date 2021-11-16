package com.eurekaclient.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author mounika.kuna
 *
 */
@RestController
@RequestMapping(value = "hello")
public class AppController {
	@GetMapping("/welcome")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("Welcome eureka client", HttpStatus.ACCEPTED);
	}

}
