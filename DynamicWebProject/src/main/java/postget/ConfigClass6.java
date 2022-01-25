package postget;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;  
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfig
 */
@WebServlet("/ConfigClass6")
public class ConfigClass6 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    ServletConfig config=getServletConfig();  
	    String host=config.getInitParameter("driver");  
	    out.println("Driver is:"+host);  
	    String name=config.getInitParameter("username");  
	    out.println("<br>username is:"+name); 
	   
	    out.close();
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");  
		PrintWriter pw=response.getWriter();  
		  
		//creating ServletContext object  
		ServletContext context=getServletContext();  
		  
		//Getting the value of the initialization parameter and printing it  
		String driverName=context.getInitParameter("password");  
		pw.println("password ="+driverName);  
		  
		pw.close();  
	   // out.close();}
	}

}
