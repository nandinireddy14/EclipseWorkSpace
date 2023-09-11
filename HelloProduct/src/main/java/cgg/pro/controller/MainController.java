package cgg.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cgg.pro.dao.ProDaoImpl;
import cgg.pro.model.Product;

@Controller
public class MainController {

	@Autowired
	private ProDaoImpl pro;
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/addProduct")
	public String addProduct(Model m) {
		m.addAttribute("title","add Product");
		return "add_product_form";
	}
	@RequestMapping(value="/handleProduct", method = RequestMethod.POST)
	public void handleProduct(@ModelAttribute Product p) {
		
		System.out.println(p);
		int i = pro.savePro(p);
		System.out.println(p);
	}
	
}
