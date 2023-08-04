package cgg.stateless;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		String name=request.getParameter("name");
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello "+name+" Welcome to my website</h1>");
		out.println("<h1><a href='servlet2'>Go to servlet 2 </a></h1>");
		
		//create a cookie
		Cookie cookie = new Cookie("user_name",name);
		
		response.addCookie(cookie);
	}
}
