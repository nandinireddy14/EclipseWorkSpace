package cgg.ecom.servlets;

import java.io.IOException;

import cgg.ecom.dao.UserDao;
import cgg.ecom.entities.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		UserDao userDao = new UserDao();
		System.out.println(email);
		Users user = userDao.getUser(email,password);
		
		
		
		
		if(user==null) {
			 
					HttpSession session = request.getSession();
					session.setAttribute("name", "Enter Valid Credentials");
					response.sendRedirect("login.jsp");
				
		}
		else {
			String userType = user.getUserType();
			
		if(userType.equals("admin"))
		{
			System.out.print(userType);
			HttpSession session = request.getSession();
			session.setAttribute("current_user", "admin");
			session.setAttribute("username", user.getUserName());
			session.setAttribute("message", "Dear admin you have successfully logged in");
			
			response.sendRedirect("admin.jsp");
		}
		else
		{
			HttpSession session = request.getSession();
			session.setAttribute("current_user", "normal");
			session.setAttribute("username", user.getUserName());
			session.setAttribute("message", "Dear"+user.getUserName()+" you have successfully logged in");
			response.sendRedirect("normal.jsp");
		}
		}
		
		
	}

}
