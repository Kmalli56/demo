package com.springcloudrouting.util;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author mounika.kuna
 *
 */
@Configuration
public class MyRouting {

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		// return builder.routes().route(r ->
		// r.path("/employee/**").uri("http://localhost:9095/"))
		// .route(r -> r.path("/department/**").uri("http://localhost:9096/")).build();
		return builder.routes().route(r -> r.path("/users/**").uri("http://localhost:9091/"))
				.route(r -> r.path("/pet/**").uri("http://localhost:8080/")).build();
	}

}
