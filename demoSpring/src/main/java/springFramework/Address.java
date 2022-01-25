/*
 * package springFramework;
 * 
 * public class Address { String address1; String address2; public Address() {
 * System.out.println("constructor address class"); } public String
 * getAddress1() { return address1; } public void setAddress1(String address1) {
 * System.out.println("setter address class1"); this.address1 = address1; }
 * public String getAddress2() { return address2; } public void
 * setAddress2(String address2) { System.out.println("setter address class2");
 * this.address2 = address2; } }
 */


  package springFramework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/*@Component is an annotation that allows Spring to automatically detect our custom beans.

In other words, without having to write any explicit code, Spring will:

Scan our application for classes annotated with @Component
Instantiate them and inject any specified dependencies into them
Inject them wherever needed*/

@Component("myAddress")
  public class Address { 
	  @Value("second street")
	  String address1;
	  @Value("chennai")
	  String address2; 
	  public Address() {
  System.out.println("constructor address class"); } public String
  getAddress1() { return address1; } public void setAddress1(String address1) {
  System.out.println("setter address class1"); this.address1 = address1; }
  public String getAddress2() { return address2; } public void
  setAddress2(String address2) { System.out.println("setter address class2");
  this.address2 = address2; } }
 

