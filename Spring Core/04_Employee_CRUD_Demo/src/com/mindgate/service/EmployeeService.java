package com.mindgate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mindgate.repository.EmployeeRepositoryInterface;
@Service
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	private EmployeeRepositoryInterface employeeRepositoryInterface;

	@Override
	public boolean addEmployee() {

		System.out.println("EmployeeService addEmployee()");
		return employeeRepositoryInterface.addEmployee();
	}

	public EmployeeRepositoryInterface getEmployeeRepositoryInterface() {
		return employeeRepositoryInterface;
	}

	public void setEmployeeRepositoryInterface(EmployeeRepositoryInterface employeeRepositoryInterface) {
		this.employeeRepositoryInterface = employeeRepositoryInterface;
	}

}
