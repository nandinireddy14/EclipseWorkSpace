package cgg.ecom.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import cgg.ecom.dao.UserDao;
import cgg.ecom.entities.Users;

public class Adding extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Adding() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adding = request.getParameter("adding");
		System.out.println(adding);
		if(adding.equals("add_user")) {
			
			String name = request.getParameter("user_name");
			String email = request.getParameter("user_email");
			String password = request.getParameter("user_password");
			String phone = request.getParameter("user_phone");
			String address = request.getParameter("user_address");
			
			Users u = new Users();
			u.setUserName(name);
			u.setUserEmail(email);
			u.setUserPassword(password);
			u.setUserPhone(phone);
			u.setUserPhone(phone);
			u.setUserAddress(address);
			u.setUserType("normal");
			UserDao userDao = new UserDao();
			userDao.addUser(u);		
			HttpSession session = request.getSession();
			session.setAttribute("name", "User added successfully");
			response.sendRedirect("admin.jsp");
			
			}
	}

}
