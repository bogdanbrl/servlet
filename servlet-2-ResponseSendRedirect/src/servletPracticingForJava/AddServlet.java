package servletPracticingForJava;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	// public void service(HttpServletRequest req, HttpServletResponse res) throws IOException or
	//public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException or
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 	 	
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
			
			
		//this tehnic adds "sq?k="+k to http link
//		res.sendRedirect("sq?k="+k);
		
		
		//send cookie
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		
		
		//if we want to not send value to http link, we will use HttpSession
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
	}
	
}
