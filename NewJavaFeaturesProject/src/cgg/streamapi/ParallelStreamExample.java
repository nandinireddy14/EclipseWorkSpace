package cgg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(new Product(23,"potatoes"),
				new Product(25,"apple"),
				new Product(14,"orange"),
				new Product(13,"lemon"),
				new Product(13,"tangarine"));
		//1. creating parallel stream from collections
		
		Stream<Product> streamCollection = productList.parallelStream();
		boolean parallel = streamCollection.isParallel();
		System.out.println(parallel);
		
		boolean anyMatch = streamCollection.map(product->product.getPrice()*12).anyMatch(price->price>200);
		System.out.println(anyMatch);
		
		//2.creating parallel stream from IntStream,LongStream,DoubleStreaam
		System.out.println("------------------------------");
		IntStream intStreamParallel = IntStream.range(1, 150).parallel();
		boolean parallel2 = intStreamParallel.isParallel();
		System.out.println(parallel2);
		
		System.out.println("-------------------------------");
		
		//3.convert stream from parallel to sequential mode
		IntStream intStreamSequential = intStreamParallel.sequential();
		boolean parallel3 = intStreamSequential.isParallel();
		System.out.println(parallel3);
	}

}
