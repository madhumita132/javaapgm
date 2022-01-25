package postget;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletClass5
 */
@WebServlet("/ServletClass5")
public class ServletClass5 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empname1=request.getParameter("empname");
		String empid1=request.getParameter("empid");
		String designation=request.getParameter("Designation");
		String address=request.getParameter("Address");
		if(designation!=null&&designation.length()<=5) {
			RequestDispatcher rd=request.getRequestDispatcher("ServletClass6");
			rd.forward(request, response);
		}
		else {
			PrintWriter pw=response.getWriter();
			RequestDispatcher rd=request.getRequestDispatcher("NewServlet6.html");
			rd.include(request, response);
			pw.println("<h2>Sorry dest should not be more than 5 char</h2>");  
		}
		}
		

}
