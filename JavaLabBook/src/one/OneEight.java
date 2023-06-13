package one;

enum Gender
{
	MALE,
	FEMALE
}


class PersonClassTwo
{
	String fname;
	String lname;
	Gender gender;
	String phone;
	
	
	
	public PersonClassTwo() {
		super();
	}


	public PersonClassTwo(String fname, String lname, Gender gender, String phone) {
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

	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		
		if(gender==Gender.MALE || gender==Gender.FEMALE)
		{
			this.gender = gender;
		}
	}


	public void getDetails()
	{
		System.out.println("First Name: "+fname+"\nLast Name: "+lname+"\nGender: "+gender+"\nPhone Number :"+phone);
	}
}

public class OneEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonClassTwo p1=new PersonClassTwo();
		p1.setFname("nandini");
		p1.setLname("jillala");
		p1.setGender(Gender.FEMALE);
		p1.setPhone("1234567890");
		System.out.println("First Name: "+p1.getFname());
		System.out.println("Last Name: "+p1.getLname());
		System.out.println("Gender: "+p1.getGender());
		System.out.println("Phone Number: "+p1.getPhone());
	}


}
