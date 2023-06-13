package one;

class PersonClass
{
	String fname;
	String lname;
	String gender;
	String phone;
	
	
	
	public PersonClass() {
		super();
	}


	public PersonClass(String fname, String lname, String gender, String phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.phone = phone;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
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
		System.out.println("First Name: "+this.fname+"\nLast Name: "+this.lname+"\nGender: "+this.gender+"\nPhone Number :"+this.phone);
	}
}

public class OneSeven {

	public static void main(String[] args) {
		
	//	Person p=new Person("nandini","jillala","20");
//		p.getDetails();
		PersonClass p1=new PersonClass();
		p1.setFname("nandini");
		p1.setLname("jillala");
		p1.setGender("F");
		p1.setPhone("1234567890");
		System.out.println("First Name: "+p1.getFname());
		System.out.println("Last Name: "+p1.getLname());
		System.out.println("Gender: "+p1.getGender());
		System.out.println("Phone Number: "+p1.getPhone());
	}

}
