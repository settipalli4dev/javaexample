package com.h2.api.h2databaseapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2.api.h2databaseapi.model.Test;
import com.h2.api.h2databaseapi.repository.EmployeeRepository;

@RestController
@RequestMapping("/v1/api")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/employee/create")
	public ResponseEntity<Test> createEmployee(@RequestBody Test emp) {

		System.out.println("Request ::::" +emp);

		Test response = employeeRepository.save(emp);

		System.out.println("Response ::::" +response);

		return new ResponseEntity<Test>(response, HttpStatus.OK);
	}

}
