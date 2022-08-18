package com.mindgate;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		//System.out.println("Database Connection Successful");
		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class);
		//Employee employee = new Employee(6, "Updated Name", 4200);
		boolean result = employeeService.deleteEmployee(6);
		if (result) 
			System.out.println("Updated Successfully");
			else
				System.out.println("Failed to insert");
			
		
		//		Employee employee = employeeService.getEmployeeByEmployeeId(2);
//		System.out.println(employee);
		List<Employee> allEmployees = employeeService.getAllEmployees();
	for (Employee e : allEmployees) {
		System.out.println(e);
//		}
	}}}
	
