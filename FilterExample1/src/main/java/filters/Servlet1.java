package filters;

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
		
		out.println("<h2>Welcome to Servlet1</h2>");
	}

	public void doFilter() {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String userid=request.getParamter("userid");
		String password=request.getParamter("userid");
		
		if(userid.equals("")&& password.equals("")) {
			out.println("<h2>Error in Input</h2>");
			
		}
		else {
			chain.doFilter(request,response);
		}
		
	}
}
