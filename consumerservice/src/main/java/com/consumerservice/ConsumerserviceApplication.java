package com.consumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author mounika.kuna
 *
 */
@SpringBootApplication
public class ConsumerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerserviceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
