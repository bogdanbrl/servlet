package jstl_practicing;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_demonstration")
public class Servlet_demonstration extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//JSTL - JSP standard tag library
		
		
		String name= "Bogdan";
		Student student = new Student(10, "Bogdan Br.");
		
		List<Student>stds = Arrays.asList(new Student(3, "Navin"), new Student(7, "Patrick"), new Student(2, "Osa"));
		//to print a list in browser you need to use a special for in display.jsp
		request.setAttribute("stds", stds);
		
		request.setAttribute("label", name);
		request.setAttribute("std", student);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}
}
