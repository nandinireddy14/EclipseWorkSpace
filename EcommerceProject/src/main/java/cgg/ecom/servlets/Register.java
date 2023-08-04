package cgg.ecom.servlets;

import java.io.IOException;

import cgg.ecom.dao.UserDao;
import cgg.ecom.entities.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
		session.setAttribute("name", name+"You have Successfully Registered");
		
		response.sendRedirect("login.jsp");
		

	}

}
