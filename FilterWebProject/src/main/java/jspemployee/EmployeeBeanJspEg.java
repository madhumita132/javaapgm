package jspemployee;

public class EmployeeBeanJspEg {
 String username;
 int userAge;
String Password;
public String getPassword() {
	System.out.println("Password"+Password);
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getUsername() {
	System.out.println("username"+username);
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getUserAge() {
	System.out.println("userAge"+userAge);
	return userAge;
}
public void setUserAge(int userAge) {
	this.userAge = userAge;
}

 
}
