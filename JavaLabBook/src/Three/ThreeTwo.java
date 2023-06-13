package Three;

class Personone{
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Account
{
	long accNum;
	double balance;
	Person accHolder ;
	
	Account(double balance)
	{
		this.balance=balance;
		this.accNum=(long) Math.random();
	}
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	public void deposit(double mon)
	{
		this.balance=this.balance+mon;
	}
	public void withdraw(double mon)
	{
		this.balance=this.balance-mon;
	}
	public double getBalance()
	{
		return this.balance;
	}
}
class AgeException extends Exception
{

	public AgeException(String message) {
		super(message);
	}
	
}

public class ThreeTwo {
	public static void validateAge(int ag) throws AgeException
	{
		if(ag<15)
		{
			throw new AgeException("Age should be greater than 15");
		}
		else
		{
			System.out.println("validated age is >=15");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account smith = new Account(2000);
		Account kathy = new Account(3000);
		smith.deposit(2000);
		kathy.withdraw(2000);
		
		Personone p=new Personone();
//	p.setAge(18);
		p.setAge(13);
		try
		{
			validateAge(p.getAge());
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
		
	}

}
