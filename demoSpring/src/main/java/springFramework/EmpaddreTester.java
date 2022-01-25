package springFramework;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmpaddreTester {

	public static void main(String[] args) {
		/*
		 * ApplicationContext f=new
		 * ClassPathXmlApplicationContext("samplebean/resources/beanresource.xml");
		 */
		ConfigurableApplicationContext f=new ClassPathXmlApplicationContext("samplebean/resources/beanresource.xml");
Employee e=(Employee)f.getBean("empaddreTester");
System.out.println("Employee obj return value after autowriting of address class");
e.display();

		  
		 
		  
	}

}
