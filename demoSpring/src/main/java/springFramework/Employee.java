/*
a * package springFramework;
 * 
 * 
 * 
 * public class Employee { String empname; int empid; Address address; Integer
 * phoneno; Double salary; public Employee(Address address) { this.address =
 * address; System.out.
 * println("From Constructor of Employee: Created the Employee Object and injected the Address Object\n"
 * ); System.out.
 * println("Constructor Autowiring injected the object n contruuctor as: ["
 * +address+"]"); }
 * 
 * public String getEmpname() { return empname; } public void setEmpname(String
 * empname) { this.empname = empname; } public int getEmpid() { return empid; }
 * public void setEmpid(int empid) { this.empid = empid; } public Address
 * getAddress() { return address; } public void setAddress(Address address) {
 * System.out.println("setter invoked by autowriting"); this.address = address;
 * } public Integer getPhoneno() { return phoneno; } public void
 * setPhoneno(Integer phoneno) { this.phoneno = phoneno; } public Double
 * getSalary() { return salary; } public void setSalary(Double salary) {
 * this.salary = salary; }
 * 
 * public void display() {
 * System.out.println("\\nEmployee details:"+"\nemployee name:"+this.
 * empname+"\\nemployee id"+this.empid);
 * System.out.println("\nAddress1"+this.address.getAddress1()+"\nAddress2"+this.
 * address.getAddress2());
 * System.out.println("\nsalarry"+this.salary+"\nphoneno"+this.phoneno); } }
 * 
 * 
 * 
 */
package springFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empObject")  //bean entry will be automatically maintatined
class Employee {
	         @Autowired //Autowiring can happen here also before the the setter is invoked
	         private Address address;

	         //@Autowired  //This is possible because we have configured the base package in applicationContext.xml file to load all bean classes
	         public Employee(Address address) {
		                this.address = address;
	         }

	         @Value("1001")
	         private Integer employeeId;

	         private Double salary;

	         @Value("MSD")
	         private String employeeName;

	         public Employee() {
		                 System.out.println("From Constructor of Employee: Created the Employee Object and injected the Address Object\n");
	         }
	       //@Autowired  //Autowiring can happen here also when the setter is invoked for injecting values into reference variable
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
	     	}
	     }

