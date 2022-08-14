package com.one2many.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one2many.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
