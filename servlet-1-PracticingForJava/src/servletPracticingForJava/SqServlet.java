package servletPracticingForJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		//din servlet it is called fromaddServlet
//		PrintWriter out = res.getWriter();
//		out.print("Hello for SqServlet");
		
		//to print a specific value use this example
		int value = (int) req.getAttribute("k");
		value = value * value;
		PrintWriter out = res.getWriter();
		out.print("Square of result is: "+value);
	}
}
