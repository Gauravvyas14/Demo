package com.one2many.demo.services;

import com.one2many.demo.daos.EmployeeDao;
import com.one2many.demo.entities.Employee;

public interface EmployeeService {
	public Employee saveEmployee(EmployeeDao edao);

}
