package cgg.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExample {

	public static void main(String[] args) {
		
//	lambdaWithZeroPara();
//	System.out.println("---------------------------------------------"
//			+ "");
//	anonymousClassZeroPara();
//	System.out.println("---------------------------------------------");
//	
//	lambdaWithOnePara();
//	System.out.println("---------------------------------------------");
//	
//	lambdaWithMultiplePara();
//	System.out.println("---------------------------------------------");
//	
//	lambdaWithBooleanReturnType();
//	System.out.println("---------------------------------------------");
//	
//	lambdaAddition();
//	System.out.println("-------------------------------------------");
//	
//	lambdaLength();
//	System.out.println("---------------------------------------------");
//	
//	lambdaDouble();
//	System.out.println("------------------------------------------------");
//
//	lambdaToDivide();
//	System.out.println("----------------------------------------------------");
//	
//	lambdaWithInterfaceAsArgument();
//	System.out.println("------------------------------------------------------");
	
	ArrayList<Employee> list = new ArrayList<Employee>();
	
	list.add(new Employee("Nandini","abc@cgg.gov.in",50000.0));
	list.add(new Employee("Duvvaaaa","def@cgg.gov.in",30000.0));
	list.add(new Employee("Fariha","ghi@cgg.gov.in",35000.0));
	list.add(new Employee("Sindu","jkl@cgg.gov.in",45000.0));
	list.add(new Employee("Abhi","abc@cgg.gov.in",50000.0));
	
//	System.out.println("List before sorting");
//	for(Employee e :list)
//	{
//		System.out.println(e);
//	}
//	System.out.println("-------------------------------------------------------");
//	Collections.sort(list, new EmpComparator());
//	
//	System.out.println("List after sorting");
//	for(Employee e :list)
//	{
//		System.out.println(e);
//	}
	System.out.println("List before sorting");
	for(Employee e :list)
	{
		System.out.println(e);
	}
	System.out.println("-------------------------------------------------------");
//	Collections.sort(list, new Comparator<Employee>(){
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			
//			return o1.getName().compareTo(o2.getName());
//		}
//		
//	});
	
	Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()));
	Collections.sort(list,(e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
	
//	Collections.sort(list,new Comparator<Employee>() {
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			
//			return (int) (o1.getSalary()-o2.getSalary());
//		}
//		
//	});
	
	System.out.println("List after sorting");
	for(Employee e :list)
	{
		System.out.println(e);
	}
	
	
	}

//private static void lambdaWithInterfaceAsArgument() {
////		Foo f=()->System.out.println("Hello..Nandu");
////		doPerform(f);
//		doPerform(()->System.out.println("Hello..Nandu"));
//		
//	}
//
//private static void doPerform(Foo f) {
//	f.perform();
//	
//}
//
//private static void lambdaToDivide() {
//	MyInterface8 i8=(a,b)->{
//		if(b==0)
//		{
//			return 0;
//		}
//		return a/b;
//	};
//	System.out.println("Division : "+i8.safeDivide(4, 2));
//	System.out.println("Division : "+i8.safeDivide(8, 0));
//		
//	}
//
//private static void lambdaDouble() {
//	MyInterface7 i7=a->2*a;
//	System.out.println(i7.doubleMethod(4));
//		
//	}
//
//private static void lambdaLength() {
//		MyInterface6 i6=a->a.length();
//		System.out.println("Length of word is : "+i6.lengthStr("Nandini"));
//		
//	}
//
//	private static void lambdaAddition() {
//		MyInterface5 i5=(a,b)->a+b;
//		System.out.println(i5.add(10, 5));
//		
//	}
//
//	private static void lambdaWithBooleanReturnType() {
//		MyInterface4 i4=(a1,a2)->a1>a2;
//		
//		boolean ans =i4.test(4, 6);
//		System.out.println(ans);
//		System.out.println(i4.test(2, 1));
//	}
//
//	private static void lambdaWithMultiplePara() {
//		MyInterface3 i3=(name,age)->{System.out.println("name : "+name+" "
//				+ "&&  age : "+age);
//		
//		System.out.println("Heyyy..");};
//		
//		i3.method3("Nandu", 20);
//		
//	}
//
//	private static void lambdaWithOnePara() {
//		MyInterface2 i2 =name->System.out.println(name);
//		i2.method2("Nandu");
//	}
//
//	private static void anonymousClassZeroPara() {
//		MyInterface1 i1=new MyInterface1() {
//
//			@Override
//			public void method1() {
//				System.out.println("Anonymous Class..");
//				
//			}
//			
//		};
//		i1.method1();
//		
//	}
//
//	private static void lambdaWithZeroPara() {
//		//defining lambda or implementing interface
//		MyInterface1 i1=()->System.out.println("Lambda with zero paramteres.");
//
//		//calling lambda
//		i1.method1();
//	}

}
