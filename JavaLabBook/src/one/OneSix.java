package one;

class Person
{
	String fname;
	String lname;
	String gender;
	
	public Person()
	{
		System.out.println("Default Constructor");
	}
	
	public Person(String fname, String lname, String gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}
	
	

	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void getDetails()
	{
		System.out.println("First Name: "+fname+"\nLast Name: "+lname+"\nGender: "+gender);
	}
}

public class OneSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("nandini","jillala","20");
//		p.getDetails();
		
		p.setFname("nandini");
		p.setLname("jillala");
		p.setGender("F");
		System.out.println("First Name: "+p.getFname());
		System.out.println("Last Name: "+p.getLname());
		System.out.println("Gender: "+p.getGender());
	}

}
