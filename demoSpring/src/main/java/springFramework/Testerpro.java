package springFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import samplebean.resources.PropConfiguration;

public class Testerpro {

	public static void main(String[] args) {
		ApplicationContext ctc=new AnnotationConfigApplicationContext(PropConfiguration.class);
		@SuppressWarnings("unused")
		EmployeeProp emp=(EmployeeProp)ctc.getBean("employee");
		
	}

}
