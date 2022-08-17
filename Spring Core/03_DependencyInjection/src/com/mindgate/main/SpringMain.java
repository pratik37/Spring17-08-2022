package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class SpringMain {
	public static void main(String[] args) {
		System.out.println("Main Starts");
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
	System.out.println("applicationcontext is created");
//	Address address = applicationContext.getBean("address", Address.class);
//	System.out.println(address);
	System.out.println();
	Employee employee = applicationContext.getBean("employee", Employee.class);
	System.out.println(employee);
	
	System.out.println("Main Ends");
	}

}
