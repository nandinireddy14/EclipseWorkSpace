package cgg.optional;

import java.util.Optional;

public class OptionalExample {

	public static Optional<String> getName()
	{
//		String name="abc";
		String name=null;
		return Optional.ofNullable(name);
	}
	
	public static void main(String[] args) {
		
		String str=null;
//		String str="nandini";
//		if(str==null) {
//			System.out.println("This is a null object");
//		}
//		else {
//			System.out.println(str.length());
//		}
		Optional<String> ofNullable = Optional.ofNullable(str);
		System.out.println(ofNullable.isPresent());
		
//		System.out.println(ofNullable.get());
		
		System.out.println(ofNullable.orElse("No Value in this object"));
		Optional<String> name = getName();
		System.out.println(name.orElse("Null return"));
	}

}
