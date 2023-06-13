package Two;
import java.lang.Math;

class Person{
	String name;
	Float age;
	
	

	public Person(String name, Float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getAge() {
		return age;
	}

	public void setAge(Float age) {
		this.age = age;
	}
}

abstract class Account
{
	long accNum;
	double balance=500;
	Person accHolder ;
	
	Account(double balance,Person accHolder)
	{
		this.balance=balance;
		this.accNum=(long) Math.random();
		this.accHolder=accHolder;
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
	public abstract void withdraw(double mon);
	//{
//		this.balance=this.balance-mon;
	//}
	public double getBalance()
	{
		return this.balance;
	}
}

class WithdrawClass extends Account
{
	public WithdrawClass(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double mon)
	{
		this.balance=this.balance-mon;
	}
}

public class TwoOne {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person smith = new Person("smith",24f);
		Person kathy = new Person("kathy",24f);
		
//		Account s_acc = new Account(2000,smith);
//		Account k_acc = new Account(3000,kathy);
		
		Account s_acc = new WithdrawClass(2000,smith);
		Account k_acc = new WithdrawClass(3000,kathy);
		
		s_acc.deposit(2000);
		k_acc.withdraw(2000);
		
		System.out.println(s_acc.getBalance());
		System.out.println(k_acc.getBalance());
		
		System.out.println(s_acc.toString());
		System.out.println(k_acc.toString());
	}

}
