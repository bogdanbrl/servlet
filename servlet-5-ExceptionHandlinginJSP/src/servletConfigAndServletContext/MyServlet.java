package servletConfigAndServletContext;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 	 	
	{
		
		PrintWriter out = res.getWriter();
		out.print("Hi<br>");
		
		
		//use servletContext when you have global param
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("Name");
		out.print(str);
		str = ctx.getInitParameter("Phone");
		out.print("<br> You have a " + str + " phone.");
		
		
		//use servletConfig when you want to access local param. See init-param in web.xml file
		ServletConfig cfg = getServletConfig();
		String str2 = cfg.getInitParameter("Name");
		out.print("<br> Your name is "+str2+". This  value is local and can be accessed only be this servlet.");
		
	}
}
