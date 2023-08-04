package cgg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Welcome to RegisterServlet</h1>");
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		String cond=req.getParameter("condition");
		
		if(!(cond==null)) {
		if( cond.equals("checked")) {
			out.println("<h1>Name: "+name+"</h1>");
			out.println("<h1>Password: "+password+"</h1>");
			out.println("<h1>Email: "+email+"</h1>");
			out.println("<h1>Gender: "+gender+"</h1>");
			out.println("<h1>Course: "+course+"</h1>");
		}
		RequestDispatcher rd = req.getRequestDispatcher("SuccessServlet");
		rd.forward(req, resp);
		}
		else {
			out.println("<h1>You have not accepted terms and conditions</h1>");
			
			//include the output of index.html
			//get the objecet of requestdispatcher
			
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}

	}

}
