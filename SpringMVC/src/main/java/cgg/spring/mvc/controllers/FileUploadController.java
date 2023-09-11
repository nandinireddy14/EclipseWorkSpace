package cgg.spring.mvc.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FileUploadController {
	
	
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int id,@PathVariable("userName") String name) {
		System.out.println(id); 
		System.out.println(name);
		
//		String str=null;
//		System.out.println(str.length());
		
		Integer.parseInt(name);
		
		return "home";
	}
	
	
	
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
	
//	@RequestMapping(path="/uploadimage",method=RequestMethod.POST)
	@PostMapping(path="/uploadimage")
	public String fileUpload(@RequestParam("profile") MultipartFile file,HttpServletRequest s,Model m) {
		System.out.println(file);
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		
int[] a= {1,2,3};
		
		a[3]=10;
		
		byte[] data = null;
		try {
			data = file.getBytes();

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//we have to save file to server
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fos = new FileOutputStream(path);
			try {
				fos.write(data);
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("file uploaded successfully");
			m.addAttribute("msg","File uploaded");
			m.addAttribute("filename",file.getOriginalFilename());
			
		} catch (FileNotFoundException e) {
			System.out.println("file uploading error");
			m.addAttribute("msg","uploading error");
			e.printStackTrace();
		}
		
		
		
		return "filesuccess";
	}
	
	
//	//handling errors in spring mvc
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value= {NullPointerException.class})
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg","Nullpointer");
//		return "error_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value= {NumberFormatException.class})
//	public String exceptionHandlerNumber(Model m) {
//		m.addAttribute("msg","NumberFormat");
//		
//		return "error_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value= {Exception.class})
//	public String exceptionHandler(Model m) {
//		m.addAttribute("msg","Others");
//		
//		return "error_page";
//	}
}
