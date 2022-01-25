package springFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class EmployeeProp {


}@Component("empObject")  //bean entry will be automatically maintatined
class Employee {
    @Autowired //Autowiring can happen here also before the the setter is invoked
    private Address address;

  
    @Value("${employeeId}")//SPEL-spring expression language taken form properties
    private Integer employeeId;
    @Value("${salary}")
    private Double salary;

    @Value("${employeeName}")
    private String employeeName;
    @Value("${driver}")
    private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println(".......................From Setter of Address....");
		this.address = address;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		System.out.println("FRom setter of EmployeeId");
		this.employeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		System.out.println("From setter of Salary");
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void display() {
		System.out.println("\nEmployee Details are:");
		System.out.println("Employee ID:" + this.employeeId);
		System.out.println("Employee Salaray:" + this.salary);
		System.out.println("Emloyee Name: " + this.employeeName);
		System.out.println("\nAddress line1:" + this.address.getAddress1());
		System.out.println("Address line2:" + this.address.getAddress2());
		System.out.println("driver:" +this.test);
	}

}


