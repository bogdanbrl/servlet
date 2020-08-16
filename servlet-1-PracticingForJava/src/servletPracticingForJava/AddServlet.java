package servletPracticingForJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	// public void service(HttpServletRequest req, HttpServletResponse res) throws IOException or
	//public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException or
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 	 	
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		
		
		//call a servlet from html file - in our case index.html
		PrintWriter out = res.getWriter();
		out.println("result is: "+k);
		
		
		//call a servlet from servlet using requestDispatcher
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		// for sending a value to another servlet, use req.setAttribute
		req.setAttribute("k", k);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}
	
}
