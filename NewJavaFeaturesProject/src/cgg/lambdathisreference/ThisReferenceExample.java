package cgg.lambdathisreference;

public class ThisReferenceExample {
	
	public void process()
	{
		doOperate(30,n->{
			System.out.println(30+n);
			System.out.println(this);
		});
	}
public static void main(String[] args) {
	int x=20;
//	ThisReferenceExample.doOperate(x, new Operation() {
//
//		@Override
//		public void operate(int i) {
//			System.out.println(x+i);
//			System.out.println(this);
//			
//		}
//		
//	});
	ThisReferenceExample example = new ThisReferenceExample();
	example.process();
	
	doOperate(x,n->{
		System.out.println(n+x);
//		System.out.println(this);
	
	
	});
}
private static void doOperate(int i,Operation o)
{
	o.operate(i);
}

}
