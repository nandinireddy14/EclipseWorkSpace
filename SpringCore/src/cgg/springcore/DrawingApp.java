package cgg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
//		Triangle triangle = new Triangle(); obseleted style
		
//		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle triangle=(Triangle)factory.getBean("triangle");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle)context.getBean("triangle");//using id in bean tag of spring.xml;
//		Triangle triangle=(Triangle)context.getBean("triangle-name");//using name in bean tag of spring.xml;
//		Triangle triangle=(Triangle)context.getBean("triangle-alias");//using alias tag of spring.xml;

		
		triangle.draw();

	}

}
