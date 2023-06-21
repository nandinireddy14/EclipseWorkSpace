package cgg.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectExample {

	public static void main(String[] args) {
	List<Product> productList = Arrays.asList(new Product(23,"potatoes"),
			new Product(25,"apple"),
			new Product(14,"orange"),
			new Product(13,"lemon"),
			new Product(13,"tangarine"));
	
//	method1(productList);
	
	IntSummaryStatistics collect = productList.stream().collect(Collectors.summarizingInt(Product::getPrice));
	System.out.println(collect);
	
	System.out.println("-----------------------");
	Map<Integer, List<Product>> collect2 = productList.stream().collect(Collectors.groupingBy(Product::getPrice));
	collect2.forEach((k,v)->{
		System.out.println(k);
		System.out.println(v);
	});
	
	//dividing stream's elements into group's according to some predicate
	System.out.println("-------------------------");
	
	Map<Boolean, List<Product>> collect3 = productList.stream().collect(Collectors.partitioningBy(p->p.getPrice()>15));
	collect3.forEach((k,v)->{
		System.out.println(k);
		System.out.println(v);
	});
	
	//pushing the collector to perform additional transformation
	System.out.println("---------------------------");
	
	Set<Product> collect4 = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
	collect4.forEach(System.out::println);
	
	}

	private static void method1(List<Product> productList) {
		//convert stream to collection
		List<String> collect = productList.stream().map(Product::getName).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		//reduce to string
		
		String collect2 = productList.stream().map(Product::getName).collect(Collectors.joining(",","[","]"));
		System.out.println(collect2);
		
		System.out.println("--------------------------");
		
		//average price
		Double collect3 = productList.stream().collect(Collectors.averagingInt(Product::getPrice));
		System.out.println(collect3);
	}

}
