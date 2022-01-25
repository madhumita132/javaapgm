package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletDemo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
	       PrintWriter pw = response.getWriter(); // to write dynamic output in response
	       
	       //generating response content
	       pw.println("<html><body>");
	       pw.println("Welcome to Servlet This is processed by doGet Method");
	       pw.println("</body> </html>");
	       
	       //close PrintWriter object once response generation is over
	       pw.close();

		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);


}
}

