package samplebean.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springFramework.Addresscon;
import springFramework.Employeecon;

@Configuration
public class MyConfiguration {
	@Bean(name="employee")
public Employeecon createEmployee() {
	Employeecon employee=new Employeecon();
	employee.setEmployeeId(101);//equivalet to setter injection <property>
	employee.setEmployeeName("madhu");
	employee.setSalary(4500.0);
	Addresscon address= createAddress();
	employee.setAddress(address);
	return employee;
	
}
	@Bean(name="address")
public Addresscon createAddress() {
	Addresscon address=new Addresscon();
	 address.setAddress1("second street");
	 address.setAddress2("chennai");
	return  address;
}
}
