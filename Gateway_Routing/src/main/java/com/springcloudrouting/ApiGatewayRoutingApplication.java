package com.springcloudrouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author mounika.kuna
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayRoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayRoutingApplication.class, args);
	}

}
