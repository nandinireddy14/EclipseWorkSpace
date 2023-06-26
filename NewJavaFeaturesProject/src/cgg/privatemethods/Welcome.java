package cgg.privatemethods;

public interface Welcome {
	void hi();
	default void greet()
	{
		System.out.println("inside default greet method");
		welcome();
		welcome2();
	}
	public static void test()
	{
		System.out.println("test");
		welcome();
//		welcome2();//error
	}
	private static void welcome()
	{
		System.out.println("Welcome to java9");
//		welcome2();//error
	}
	
	private void welcome2()
	{
		System.out.println("Welcome again to java9");
	}
	
}
