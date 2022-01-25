/*
 * package springcore;
 * 
 * import org.springframework.beans.factory.BeanFactory; import
 * org.springframework.beans.factory.xml.XmlBeanFactory; import
 * org.springframework.core.io.ClassPathResource; import
 * org.springframework.core.io.Resource;
 * 
 * 
 * public class EmployeeScopeEg {
 * 
 * public static void main(String[] args) {
 * 
 * Resource r1=new ClassPathResource("applicationContext.xml"); BeanFactory
 * f=new XmlBeanFactory(r1); Emploee emp=(Emploee)f.getBean("employeescope1");
 * emp.setEmpid(101); emp.setEmpname("varun"); emp.getEmpid(); emp.getEmpname();
 * Emploee emp1=(Emploee)f.getBean("employeescope1"); emp1.setEmpid(102);
 * emp1.setEmpname("cibi"); emp1.getEmpid(); emp1.getEmpname();
 * 
 * emp1.getEmpname(); emp.getEmpid();
 * 
 * }
 * 
 * }
 */



  package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeScopeEg {
  
  public static void main(String[] args) {
		/*
		 * Resource r1=new ClassPathResource("applicationContext.xml"); BeanFactory
		 * f=new XmlBeanFactory(r1);
		 *///f-context
  ApplicationContext f=new ClassPathXmlApplicationContext("applicationContext.xml");  
	  
  Emploee emp=(Emploee)f.getBean("employeescope1");
  emp.setEmpid(101); emp.setEmpname("varun"); emp.getEmpid(); emp.getEmpname();
  Emploee emp1=(Emploee)f.getBean("employeescope1"); emp1.setEmpid(102);
  emp1.setEmpname("cibi"); emp1.getEmpid(); emp1.getEmpname();
  
 
  
  }
  
  }
 