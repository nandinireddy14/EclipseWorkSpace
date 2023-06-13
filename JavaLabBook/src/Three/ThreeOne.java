package Three;

class Person
{
	String fname;
	String lname;
	String gender;
	
	public Person()
	{
//		System.out.println("Default Constructor");
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

class FullNameException extends Exception
{

	public FullNameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

public class ThreeOne {
	public static void validate(String fname,String lname) throws FullNameException
	{
		if(fname==null && lname==null)
		{
			throw new FullNameException("Please provide fname and lname");
		}
		else
		{
			System.out.println("Validated has fname or lname");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		
//		p.setFname("nandini");
//		p.setLname("jillala");
		p.setGender("F");
		String a=p.getFname();
		String b=p.getLname();
		try {
			validate(a,b);
			
		}
		catch(FullNameException e)
		{
	       System.out.println(e.getMessage());
	       return;
		}
		System.out.println("First Name: "+p.getFname());
		System.out.println("Last Name: "+p.getLname());
		System.out.println("Gender: "+p.getGender());

	}

}
