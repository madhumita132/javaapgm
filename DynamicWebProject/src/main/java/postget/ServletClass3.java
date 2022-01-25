package postget;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletClass3
 */
@WebServlet("/ServletClass3")
public class ServletClass3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletClass3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("user");//fetch data
	String password=request.getParameter("pass");
	if(password.equals("admin")) {
		HttpSession ses=request.getSession();
		ses.setAttribute("sess_user", name);
		ses.setAttribute("sess_pass", password);
		ses.getAttribute(password);//accessing session variable
		ses.getAttribute(name);
		
		
		out.println("Application flow is transferred to class web buisness logic and maintain the data in session<br>");
		out.println("<br>username maintained in session hiiii <br><br>" +name);
		String sesid=ses.getId();
		out.println("<br><b>session id:  </b>"+sesid);
		Date sesCreation=new Date(ses.getCreationTime());
		out.println("<br><b>session creation time:</b> "+sesCreation);
		
		Date sesLasAcess=new Date(ses.getCreationTime());
		out.println("<br><b>session last aaccess time:</b> "+sesLasAcess);
		
		
		
	}
	else {
		out.println("not in session");
	}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
