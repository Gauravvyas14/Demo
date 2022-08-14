package com.one2many.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one2many.demo.daos.EmployeeDao;
import com.one2many.demo.utils.ResponseWrapper;

@RestController
public class EmployeeController {

	@Autowired
	private ResponseWrapper responseWrapper;

	public EmployeeController(ResponseWrapper responseWrapper) {

		this.responseWrapper = responseWrapper;
	}

	@PostMapping("/add")
	public ResponseEntity<?> addEmployee(@RequestBody EmployeeDao empDao, BindingResult result) {

		return responseWrapper.addEmployeeResponse(empDao, result);

	}

}
