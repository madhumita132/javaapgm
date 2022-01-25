package example.resources;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demoproject.Address;

import demoproject.Employee;




@Configuration
public class MyConfiguration {

@Bean(name="employee")
public Employee createEmployee() {
Employee employee = new Employee();
//Equivalent to setter injection using tag: <property>
employee.setEmployeeId(1001);
employee.setEmployeeName("Abirami");
employee.setSalary(25000.00);

Address address =createAddress();
employee.setAddress(address);
return employee;
}
@Bean(name="address")
public Address createAddress() {
Address address = new Address();
address.setAddressLine1("Mahindra World City");
address.setAddressLine2("Chennai");
return address;
}
}