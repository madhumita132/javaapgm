package samplebean.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springFramework.Address;



@Configuration
public class MyConfiguration1 {
	@Bean(name="e")
public Employee1 createEmployee() {
	Employee1 e=new Employee1();
	e.setEmployeeId(101);//equivalet to setter injection <property>
	e.setEmployeeName("madhu");
	e.setSalary(4500.0);
	Address a= createAddress();
	e.setAddress(a);
	return e;
	
}
	@Bean(name="a")
public Address createAddress() {
	Address a=new Address();
	a.setAddress1("second street");
	a.setAddress2("chennai");
	return a;
}
}
