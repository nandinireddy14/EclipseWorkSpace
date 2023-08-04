package cgg.springcore;

import java.util.List;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
	return pointA;
}

public void setPointA(Point pointA) {
	this.pointA = pointA;
}

public Point getPointB() {
	return pointB;
}

public void setPointB(Point pointB) {
	this.pointB = pointB;
}

public Point getPointC() {
	return pointC;
}

public void setPointC(Point pointC) {
	this.pointC = pointC;
}

public void draw()
{
	System.out.println("Point A=("+getPointA().getX()+" , "+getPointA().getY()+")");
	System.out.println("Point B=("+getPointB().getX()+" , "+getPointB().getY()+")");
	System.out.println("Point C=("+getPointC().getX()+" , "+getPointC().getY()+")");
}


//Autowiring is a feature provided by spring framework that helps us to skip some of the configuratios that we
//have to do.we have seen that every member variable in the spring bean has to be configured if it is actually a 
//reference to a another bean.you have to specify the reference explicitly
//Autowiring helps us in reducing some of the configuration we have to do by intelligently guessing the references
//In spring.xml we have to mention the dependency by writing three different property tags
//there is a short cut here by using autowiring.if the name of the bean is same as the member variable we can ask spring
//to autowire based on name the way to do this is by writing a tag autowire="byName"
//it checks for all the member variables of this bean and see if there is any bean with this name defined in spring.xml
// if it finds a bean like that its going to automatically reference this bean to member variable
	
//Another way to autowire is byType this works if we have only one member  variable and only one bean of each type
// for example there is only one point object and there is only one bean thats defined in the xml of type particular class
//in that case what spring does is it looks for type even though the bean has been defined with a different name
//it looks for the type which is the class for which the bean has been defined and if this class matches the class the
//member variable has been defined as.
//then it automatically does the wiring



//	private List<Point> points;
//
//	public List<Point> getPoints() {
//		return points;
//	}
//
//	public void setPoints(List<Point> points) {
//		this.points = points;
//	}
//	
//	public void draw()
//	{
//		for(Point point:points) {
//			System.out.println("Point = ( "+point.getX()+" , "+point.getY()+" )");
//		}
//	}
	
//	private Point pointA;
//	private Point pointB;
//	private Point pointC;
//	
//	public Point getPointA() {
//		return pointA;
//	}
//
//	public void setPointA(Point pointA) {
//		this.pointA = pointA;
//	}
//
//	public Point getPointB() {
//		return pointB;
//	}
//
//	public void setPointB(Point pointB) {
//		this.pointB = pointB;
//	}
//
//	public Point getPointC() {
//		return pointC;
//	}
//
//	public void setPointC(Point pointC) {
//		this.pointC = pointC;
//	}
//
//	public void draw()
//	{
//		System.out.println("Point A=("+getPointA().getX()+" , "+getPointA().getY()+")");
//		System.out.println("Point B=("+getPointB().getX()+" , "+getPointB().getY()+")");
//		System.out.println("Point C=("+getPointC().getX()+" , "+getPointC().getY()+")");
//	}
	
//	private String type;
//	private int height;
//	
//	
//	public Triangle(String type) {
//		super();
//		this.type = type;
//	}
//	
//	public Triangle(int height) {
//		super();
//		this.height = height;
//	}
//	
//	
//
//	public Triangle(String type, int height) {
//		super();
//		this.type = type;
//		this.height = height;
//	}
//
//
//
//	public int getHeight() {
//		return height;
//	}
//
//
//
////	public void setHeight(int height) {
////		this.height = height;
////	}
//
//
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//
//
//	public String getType() {
//		return type;
//	}

//	public void setType(String type) {
//		this.type = type;
//	}

//	public void draw()
//	{
//		System.out.println(getType()+" Triangle drawn of height "+getHeight());
//	}
}
