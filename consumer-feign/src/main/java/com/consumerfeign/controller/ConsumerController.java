package com.consumerfeign.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumerfeign.dto.Department;
import com.consumerfeign.dto.EmployeeDto;
import com.consumerfeign.service.ProducerClient;

/**
 * 
 * @author mounika.kuna
 *
 */
@RestController
@RequestMapping("/department")
public class ConsumerController {
	@Autowired
	private ProducerClient producerClient;

	@GetMapping("/consume")
	public ResponseEntity<String> getFromProducer() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		// String fromProducer = restTemplate
		// .exchange("http://localhost:9091/employee/hai", HttpMethod.GET, entity,
		// String.class).getBody();
		return producerClient.check();
	}

	@PostMapping("createDepartment")
	public ResponseEntity<Department> createEmployee(@RequestBody Department department) {
		return new ResponseEntity<Department>(department, HttpStatus.OK);
	}

	@GetMapping("/readAllDepartments")
	public ResponseEntity<List<Department>> readAllDepartments() {
		// List<EmployeeDto> employee1 =
		// restTemplate.getForObject("http://localhost:9091/employee/readAllEmployees",ArrayList.class);
		List<EmployeeDto> employee1 = producerClient.getAllEmployees();
		Department department1 = new Department(1, "Development", employee1);
		// List<EmployeeDto> employee2 =
		// restTemplate.getForObject("http://localhost:9091/employee/readAllEmployees",
		// ArrayList.class);
		List<EmployeeDto> employee2 = producerClient.getAllEmployees();
		Department department2 = new Department(2, "Development", employee2);

		List<Department> departments = new ArrayList<>();
		departments.add(department1);
		departments.add(department2);

		return new ResponseEntity<List<Department>>(departments, HttpStatus.OK);
	}

	@GetMapping("/readDepartmentByDepId/{depId}")
	public ResponseEntity<Department> readEmployeeByDepId(@PathVariable int depId) {
		// List<EmployeeDto> employeesLst =
		// restTemplate.getForObject("http://localhost:9091/employee/readEmployeeByDepId/"
		// + depId, ArrayList.class);
		List<EmployeeDto> employeesLst = producerClient.getAllEmployees();
		Department department = new Department(1, "Training", employeesLst);
		return new ResponseEntity<Department>(department, HttpStatus.OK);
	}

}
