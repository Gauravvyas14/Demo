package com.one2many.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import com.one2many.demo.daos.EmployeeDao;
import com.one2many.demo.entities.Employee;
import com.one2many.demo.services.EmployeeService;
import com.one2many.demo.services.ValidationErrorService;

@Component
public class ResponseWrapper {

	@Autowired
	private ValidationErrorService validationErrorService;

	@Autowired
	private EmployeeService empService;

	public ResponseEntity<?> addEmployeeResponse(EmployeeDao empDao, BindingResult result) {

		if (validationErrorService.validate(result) != null)
			return validationErrorService.validate(result);
		else {
			
			Employee emp = empService.saveEmployee(empDao);

			return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
		}
	}

}
