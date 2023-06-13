package Two;

class SavingsAccount extends Account
{

	public SavingsAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	final double minBal=500;

	@Override
	public void withdraw(double mon) {
		// TODO Auto-generated method stub
		
		if(getBalance()>500)
		{
			withdraw(mon);
		}
	}
	
}

class CurrentAccount extends Account
{
	
	

	public CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	int limit=5;
	int count=0;
	@Override
	public void withdraw(double mon) {
		// TODO Auto-generated method stub
		if(count<=5)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
	}
}


public class TwoTwo {

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
