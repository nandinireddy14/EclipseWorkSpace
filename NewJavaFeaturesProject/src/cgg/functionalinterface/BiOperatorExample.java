package cgg.functionalinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BinaryOperator;

public class BiOperatorExample {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("X", "A");
		map.put("Y", "B");
		map.put("Z", "C");

		BinaryOperator<String> binaryOpt=(s1,s2)->s1+"-"+s2;
		binaryOperatorFun(binaryOpt,map).forEach(System.out::println);
		
	}

	private static List<String> binaryOperatorFun(BinaryOperator<String> binaryOpt,
			HashMap<String, String> map) {
		
		ArrayList<String> biList = new ArrayList<String>();
		map.forEach((s1,s2)->biList.add(binaryOpt.apply(s1, s2)));
		return biList;
	}

}
