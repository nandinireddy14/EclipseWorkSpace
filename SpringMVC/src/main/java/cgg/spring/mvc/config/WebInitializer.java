package cgg.spring.mvc.config;




import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import jakarta.servlet.MultipartConfigElement;
import jakarta.servlet.ServletRegistration;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class [] {AppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String [] {"/"};
	}
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
	    MultipartConfigElement multipartConfigElement = new MultipartConfigElement("", 2097152, 4194304, 0);
	    registration.setMultipartConfig(multipartConfigElement);
	}

}


