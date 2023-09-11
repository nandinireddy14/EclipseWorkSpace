package cgg.spring.mvc.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		
		System.out.println("This is first handler");
		/*
		 * try { response.sendRedirect("two"); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 
		
		
		return "one";*/
		
		RedirectView view = new RedirectView();
		view.setUrl("two");
//		view.setUrl("https://www.google.com");
		return view;
		
//		return "redirect:/two";
//		return "redirect:https://www.google.com";
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is second handler");
//		return "two";
		return "contact";
	}

}
