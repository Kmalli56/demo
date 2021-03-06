package com.SpringBootConcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 // swagger annotation
public class SpringBootConceptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConceptsApplication.class, args);
	}

}
