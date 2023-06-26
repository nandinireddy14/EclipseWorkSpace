package cgg.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndFailSafeIteratorExample {

	public static void main(String[] args) {
//		failFastIteratorDemo();
		
		System.out.println("-------------------------------------");
		failSafeIteratorDemo();
	}

	private static void failSafeIteratorDemo() {
		ConcurrentHashMap<String, String> phoneMap = new ConcurrentHashMap<String,String>();
		phoneMap.put("Apple", "iphone");
		phoneMap.put("HTC", "HTC One");
		phoneMap.put("Samsung", "S6");
		
		Set<String> keySet = phoneMap.keySet();
		Iterator<String> itr = keySet.iterator();
		
		
		while(itr.hasNext())
		{
			phoneMap.put("Sony", "Xperia Z"); //No Concurrent Modification Exception
			String phoneType = itr.next();
			System.out.println(phoneType+"\t"+phoneMap.get(phoneType));
		}
		
	}

	private static void failFastIteratorDemo() {
		HashMap<String, String> phoneMap = new HashMap<String,String>();
		phoneMap.put("Apple", "iphone");
		phoneMap.put("HTC", "HTC One");
		phoneMap.put("Samsung", "S6");
		
		Set<String> keySet = phoneMap.keySet();
		Iterator<String> itr = keySet.iterator();
		
		
		while(itr.hasNext())
		{
//			phoneMap.put("Sony", "Xperia Z"); //Concurrent Modification Exception
			String phoneType = itr.next();
			System.out.println(phoneType+"\t"+phoneMap.get(phoneType));
		}
	}

}