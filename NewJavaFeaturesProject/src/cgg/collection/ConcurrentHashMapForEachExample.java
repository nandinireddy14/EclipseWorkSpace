package cgg.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapForEachExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
		
		for (int i = 1; i < 101; i++) {
			hashMap.put(i, "person_"+i);
		}
		
		hashMap.forEach((key,val)->{
			System.out.println("Thread:"+Thread.currentThread().getName());
			
			System.out.println(key+"\t"+val);
		});
		System.out.println("----------------------------------------------------------");
		
		//parallelism
		hashMap.forEach(3,(key,val)->{
			System.out.println("Thread:"+Thread.currentThread().getName());
			
			System.out.println(key+"\t"+val);
		});
		
//		hashMap.forEachKey(2, (key)->{
//				System.out.println("Thread:"+Thread.currentThread().getName());
//			
//			System.out.println(key);
//		});
//		
//		hashMap.forEachValue(3, (val)->{
//			System.out.println("Thread:"+Thread.currentThread().getName());
//			
//		System.out.println(val);
//		});

	}

}
