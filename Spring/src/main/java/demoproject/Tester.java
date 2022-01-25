package demoproject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.resources.MyConfiguration;



public class Tester {

	
	  @SuppressWarnings("resource")
	public static void main(String[] args) {
	 	 
	 	 ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
	 	 Employee employee=(Employee) ctx.getBean("employee");
	 	 //Employee employee=(Employee) ctx.getBean("createEmployee");
	 	 employee.display();
	  }
	 
	}

