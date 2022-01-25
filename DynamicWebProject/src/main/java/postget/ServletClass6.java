package postget;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletClass6
 */
@WebServlet("/ServletClass6")
public class ServletClass6 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empname1=request.getParameter("empname");
		String empid1=request.getParameter("empid");
		String designation=request.getParameter("Designation");
		String address=request.getParameter("Address");
		PrintWriter pw=response.getWriter();
		pw.println("<h2>"+empname1+" is registered successfully");
		pw.println("designation:<b>"+designation);
		pw.println("Empid:<b>"+empid1);
		pw.println("Address:<b>"+address);
		//doGet(request, response);
	}

}
