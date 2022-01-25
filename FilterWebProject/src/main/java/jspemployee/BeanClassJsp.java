package jspemployee;

public class BeanClassJsp {
	private String empName;
	private int eno;
	private int salary;
	private int hiredDate;

	// getters and setters of the variables above
	public String getEmpName() // getter
	{
		System.out.println("employeename: " + empName);
		return empName;
	}

	public void setEmpName(String empName)// setter
	{
		this.empName = empName;
	}

	public int getEno() {
		System.out.println("employeeid: " + eno);
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public int getSalary() {
		System.out.println("salary: " + salary);
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getHiredDate() {
		System.out.println("hired date: " + hiredDate);
		return hiredDate;
	}

	public void setHiredDate(int hiredDate) {
		this.hiredDate = hiredDate;
	}
}
