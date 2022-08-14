package com.one2many.demo.utils;

import java.util.ArrayList;
import java.util.List;

import com.one2many.demo.daos.AddressDao;
import com.one2many.demo.daos.EmployeeDao;
import com.one2many.demo.entities.Address;
import com.one2many.demo.entities.Employee;

public class ObjectConverter {

	public static Employee employeeDaoToEmployee(EmployeeDao edao) {

		Employee emp = new Employee();
		List<Address> addressList = new ArrayList<Address>();

		emp.setFirstName(edao.getFirstName());
		emp.setLastName(edao.getLastName());
		emp.setEmail(edao.getEmail());
		emp.setPhone(edao.getPhone());
		emp.setAddressList(addressList);

		return emp;

	}

}
