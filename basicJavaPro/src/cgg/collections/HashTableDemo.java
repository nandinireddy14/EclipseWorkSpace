package cgg.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Double> balance = new Hashtable<>();
		
		balance.put("ABC", 5000.0);
		balance.put("PQR", 8000.0);
		balance.put("MNO", 6000.0);
		balance.put("XYZ", 5500.0);
		
		System.out.println(balance);
		//traversing using enumeration
		Enumeration<String> keys = balance.keys();
		while(keys.hasMoreElements()) {
			String ele=keys.nextElement();
			System.out.println(ele+"=>"+balance.get(ele));
		}
		
		double val=balance.get("PQR");
		double newValue=val+2000;
		balance.put("PQR", newValue);
		System.out.println(balance.get("PQR"));
		
		System.out.println("--------------FOR EACH--------------");
		balance.forEach((k,v)->System.out.println(k+" : "+v));
	}

}
