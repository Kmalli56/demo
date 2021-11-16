package com.springbootvalidation.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootvalidation.exception.CustomError;
import com.springbootvalidation.model.Employee;


@RestController
public class EmployeeController {
	@PostMapping(value = "create")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
		System.out.println(employee.getEmployeeNo());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getDob());
		System.out.println(employee.getEmail());
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}

	@GetMapping("/")
	public Employee getEmployee() {
		return new Employee(56, "Mallikarjun", LocalDate.now(), 202303.4f, "kmmallikarjuna12@gmail.com");
	}

	// EXCEPTION HANDLER - particular exception - application/global level
	// @ExceptionHandler(MethodArgumentNotValidException.class,ArrayIndexOutOfBoundException)
	// @ExceptionHandler(MethodArgumentNotValidException.class)
	// public ResponseEntity<CustomError> handleException(){
	// CustomError customError = new CustomError(LocalDateTime.now(), "Message"
	// ,"PleaseVerify");
	// return new ResponseEntity<CustomError>(customError, HttpStatus.BAD_REQUEST);
	// }
}
