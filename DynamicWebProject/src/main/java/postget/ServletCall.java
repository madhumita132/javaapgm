package postget;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value="/ServletCall",initParams= {@WebInitParam(name="trainingname",value="java"),@WebInitParam(name="trainingtype",value="streamjava")})
public class ServletCall extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("control reaches doPost method");
			//doGet(request, response); //If you have given this statement, control is transferred from dopost to to doget which is used for testing purpose about transferring the cinputs in url
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String name = request.getParameter("user"); //receiving value from request page
            out.print("Hello " + name + " Processed in doPost() method.");
	 }
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {
		System.out.println("control reaches doGet method");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String name = request.getParameter("user");
            String tname =getInitParameter("trainingname");
            String ttype =getInitParameter("trainingtype");
            out.print("Hello " + name + ","+ tname +" & "+ ttype + " Processed in doGet() method.");
            out.close();
            
}
}
