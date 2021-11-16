package com.consumerfeign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.consumerfeign.dto.EmployeeDto;

@FeignClient(name = "simple-Ref", url = "http://localhost:9095/employee")
public interface ProducerClient {
	
	@GetMapping("/hai")
	public abstract ResponseEntity<String> check();

	@GetMapping("/readAllEmployees")
	public abstract List<EmployeeDto> getAllEmployees();

	@GetMapping("/createEmployee")
	public abstract ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto);

	@GetMapping("/readEmployeeByDepId/{depId}")
	public abstract List<EmployeeDto> readEmployeeById(int depId);
	
}
