package cgg.spring.mvc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
	//centralized handling errors in spring mvc
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= {NullPointerException.class})
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg","Nullpointer");
		return "error_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= {NumberFormatException.class})
	public String exceptionHandlerNumber(Model m) {
		m.addAttribute("msg","NumberFormat");
		
		return "error_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= {Exception.class})
	public String exceptionHandler(Model m) {
		m.addAttribute("msg","Others");
		
		return "error_page";
	}

}
