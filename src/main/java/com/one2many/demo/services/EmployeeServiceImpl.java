package com.one2many.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one2many.demo.daos.AddressDao;
import com.one2many.demo.daos.EmployeeDao;
import com.one2many.demo.entities.Address;
import com.one2many.demo.entities.Employee;
import com.one2many.demo.repositories.AddressRepository;
import com.one2many.demo.repositories.EmployeeRepository;
import com.one2many.demo.utils.ObjectConverter;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Employee saveEmployee(EmployeeDao edao) {

		Employee emp = employeeRepository.save(ObjectConverter.employeeDaoToEmployee(edao));
		for (AddressDao ada : edao.getAddressList()) {
			Address address = new Address();
			address.setHouseNumber(ada.getHouseNumber());
			address.setArea(ada.getArea());
			address.setStreet(ada.getStreet());
			address.setCity(ada.getCity());
			address.setZipCode(ada.getZipCode());
			address.setEmployee(emp);
			emp.getAddressList().add(address);
			addressRepository.save(address);

		}

		return emp;

	}

}
