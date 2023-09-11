package cgg.spring.mvc.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping("/home")
public String home(Model model) {
	System.out.println("this is home url");
	
	model.addAttribute("name","abc");
	model.addAttribute("id",123);
	
	List<String> friends=new ArrayList<String>();
	friends.add("Nandu");
	friends.add("Divya");
	
	model.addAttribute("friends",friends);
	return "index";
}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		//creating model and view object
		ModelAndView view = new ModelAndView();
		//setting the data
		view.addObject("name","Nandu");
		view.addObject("rollnum",1234);
		LocalDateTime now = LocalDateTime.now();
		view.addObject("time",now);
		
		List<Integer> marks=new ArrayList<>();
		marks.add(100);
		marks.add(101);
		marks.add(102);
		marks.add(103);
		marks.add(104);
		view.addObject("marks",marks);
		
		
		
		
		//setting the view name
		view.setViewName("help");
		
		return view;
	}
}
