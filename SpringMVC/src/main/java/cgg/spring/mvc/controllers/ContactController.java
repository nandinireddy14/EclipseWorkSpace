package cgg.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cgg.spring.mvc.model.UserOne;
import cgg.spring.mvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Learning spring MVC");
		m.addAttribute("Desc","Home for Programs");
		System.out.println("adding common data");
	}

	@RequestMapping("/contacts")
	public String showForm() {
		System.out.println("creating form");
		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
//	public String handleForm(@RequestParam(name="email", required=true) String email,
//			@RequestParam("username") String username,
//			@RequestParam("password") String password,Model model) {
	public String handleForm(@ModelAttribute("user") UserOne user, Model model) {
//	User user=new User();
//	user.setEmail(email);
//	user.setUsername(username);
//	user.setPassword(password);

		System.out.println(user);
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg","User created with id "+createUser);
		

//	model.addAttribute("user",user);
//		
//		System.out.println("user email "+email);
//		System.out.println("user username "+username);
//		System.out.println("user password "+password);
//		
//		model.addAttribute("email",email);
//		model.addAttribute("username",username);
//		model.addAttribute("password",password);

		if (user.getUsername().isBlank()) {
			return "redirect:/contacts";
		}
		return "success";
	}
}
