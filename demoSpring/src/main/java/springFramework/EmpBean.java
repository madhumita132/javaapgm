package springFramework;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpBean {

	public static void main(String[] args) {
		//to connect xml proprty file
		Resource resource=new ClassPathResource("applicationContext.xml");
		//the container reads the configuration of meta data froom an xml and uses it to create a configured sys or app.
		BeanFactory factory=new XmlBeanFactory(resource);
		
		//getBean() method uses beanid to return generic object cast to actual object
		Employee emp=(Employee)factory.getBean("employeebean");
		System.out.println("hello"+emp.getEmployeeName());
		System.out.println("your id is:"+emp.getEmployeeId());
	}

}
