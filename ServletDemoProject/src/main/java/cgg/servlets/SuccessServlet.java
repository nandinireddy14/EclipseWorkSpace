package cgg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet {
	
public SuccessServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("this is success servlet");
	out.println("<h1>successfully submitted</h1>");
	
}

}
