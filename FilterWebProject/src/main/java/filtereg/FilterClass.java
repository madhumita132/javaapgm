package filtereg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class FilterClass implements Filter {

    public FilterClass() {
        
    }public void destroy() {
		
	}
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		out.print("before sevice method execute<br>");
		chain.doFilter(request, response);
		out.print("after sevice method execute<br>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
