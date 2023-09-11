package cgg.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDemo {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student student = context.getBean("firststudent",Student.class);
		Student student = context.getBean("getStudent",Student.class);
		
		System.out.println(student);
		student.study();
				
	}

}
//spring core lib 5.0.2 build snapshot
//javax.annoation 1.2.3
//commonloggings1.2
//spring core 5.3.10
//opt:spring beans 5.3.10
//java 17