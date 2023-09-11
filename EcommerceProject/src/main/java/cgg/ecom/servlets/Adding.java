package cgg.ecom.servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import cgg.ecom.dao.CategoryDao;
import cgg.ecom.dao.ProductDao;
import cgg.ecom.dao.UserDao;
import cgg.ecom.entities.Category;
import cgg.ecom.entities.Product;
import cgg.ecom.entities.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

@MultipartConfig
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
		else if(adding.equals("add_category")) {
		String category_name = request.getParameter("category_name");
		String category_desc = request.getParameter("category_description");
		
		Category category = new Category();
		category.setCategoryName(category_name);
		category.setCategoryDesc(category_desc);
		CategoryDao categoryDao = new CategoryDao();
		categoryDao.addCategory(category);
		HttpSession session = request.getSession();
		session.setAttribute("name", "Category added successfully");
		response.sendRedirect("admin.jsp");
		}
		else if(adding.equals("add_product")) {
			String pro_name = request.getParameter("pro_name");
			String pro_desc = request.getParameter("pro_description");
			String pro_price = request.getParameter("pro_price");
			String pro_discount = request.getParameter("pro_discount");
			String pro_quantity = request.getParameter("pro_quantity");
			String pro_category = request.getParameter("pro_category");
			Part part=request.getPart("pro_image");
			String filename=part.getSubmittedFileName();
			
			
			Product p= new Product();
			p.setProductName(pro_name);
			p.setProductDesc(pro_desc);
			p.setProductPrice(Integer.parseInt(pro_price));
			p.setProductDiscount(Integer.parseInt(pro_discount));
			p.setProductQuantity(Integer.parseInt(pro_quantity));
			p.setProductCategory(pro_category);
			p.setProductPic(filename);
			
			InputStream is = part.getInputStream();
			byte[] data=new byte[is.available()];
			is.read(data);
		    String path=getServletContext().getRealPath("Img")+File.separator+filename;
			System.out.println(path);
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			
			ProductDao productDao = new ProductDao();
			productDao.addProduct(p);		
			HttpSession session = request.getSession();
			session.setAttribute("name", "Product added successfully");
			response.sendRedirect("admin.jsp");
		}
	}

}
