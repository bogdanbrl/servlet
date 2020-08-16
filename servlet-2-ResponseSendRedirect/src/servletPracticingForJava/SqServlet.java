package servletPracticingForJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
			
		//to print a specific value use this example
//		int value = Integer.parseInt(req.getParameter("k"));
//		value = value * value;
//		PrintWriter out = res.getWriter();
//		out.print("Square of result is: "+value);
		
		
		//accept cookies  -  array of cookies
		Cookie cookies[] = req.getCookies();
		int k=0;
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("k")) {
				k=Integer.parseInt(cookie.getValue());
			}
		}
		
		
		k = k * k;
		PrintWriter out = res.getWriter();
		out.print("Square of result is: "+k);
	}
}
