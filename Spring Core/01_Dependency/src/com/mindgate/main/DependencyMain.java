package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain {
	public static void main(String[] args) {
		System.out.println("Main Start");
		//using default constructor way
//		System.out.println("creating the address object and calling set method");
//		Address address = new Address();
//		address.setAddressId(1);
//		address.setCity("Pune");
//		address.setHouseNumber("55");
//		address.setHousingName("IAPM");
//		address.setPin("412205");
//		address.setStreet("shirwal");
//		System.out.println(address);
//		System.out.println();
//		System.out.println("creating the employee object and calling set method");
//		Employee employee = new Employee();
//		employee.setEmployeeId(1);
//		employee.setName("Pratik");
//		employee.setSalary(5000);
//		employee.setHomeAddress(address);
//		System.out.println(employee);
		Address address= new Address(1, "Pune", "55", "IAPM", "412205", "shirwal");
		Employee employee = new Employee(101,"xyz", 1000, address);
		System.out.println(employee);
		System.out.println("Main End");
		
		
	}

}
