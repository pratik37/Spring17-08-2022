package com.mindgate.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository implements EmployeeRepositoryInterface {

	@Override
	public boolean addEmployee() {
		System.out.println("EmployeeRepository addEmployee()");
		return false;
	}

}
