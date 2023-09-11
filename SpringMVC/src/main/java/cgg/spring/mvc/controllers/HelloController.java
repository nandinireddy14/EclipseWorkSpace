package cgg.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("this is hello url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about url");
		return "about";
	}
}
