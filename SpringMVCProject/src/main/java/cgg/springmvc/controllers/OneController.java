package cgg.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OneController {

	@RequestMapping("/one")
public String one()
{
	System.out.println("one handler");
	return "one";
}
}
