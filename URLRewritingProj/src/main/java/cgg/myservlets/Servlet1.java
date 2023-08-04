package cgg.myservlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//name fetch..
		String name = request.getParameter("user_name");
		out.println("<h1>Your name is "+name +"</h1>");
//		out.println("<a href='servlet2?user="+name+"'>Go to second servlet2</a>");
		out.println("<form action='servlet2'>"
				+"<input type='text' name='user_name' value='"+name+"' hidden/>"
				+"<button>Go to second servlet</button>"
				
				+ "</form");
		
		
	}

}
