package cgg.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component
public class Circle implements Shape {
	private Point center;
	

	public Point getCenter() {
		return center;	}

//	@RequiredO
//	@Autowired//bytype
//	@Qualifier("circleRelated")
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
		System.out.println("Circle point is : ("+getCenter().getX()+","+getCenter().getY()+")");
		
	}
	@PostConstruct
	public void initializeCircle() {
		System.out.println("init of circle");
	}
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of circle");
	}
	
}
