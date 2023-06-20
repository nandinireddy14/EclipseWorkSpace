package cgg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class InfiniteStreamExample {

	public static void main(String[] args) {
		Stream<Integer> iterate = Stream.iterate(0, i->i+2);
		List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
//		System.out.println(collect);
		collect.forEach(System.out::println);
		System.out.println("--------------------------------");
		
		Stream<String> empty = Stream.<String>empty();//empty stream
		System.out.println("--------------------");
		//stream of collections
		List<String> asList = Arrays.asList("a","b","c");
		Stream<String> stream = asList.stream();
		
		//stream of array
		String[] arr= {"a","b","c"};
		Stream<String> stream2 = Arrays.stream(arr);
		Stream<String> stream3 = Arrays.stream(arr, 1, 2);
		stream3.forEach(System.out::println);
		//using builder method  stream.builder()
		System.out.println("----------------------------------");
		Stream<String> build = Stream.<String>builder().add("AA").add("BB").add("FF").add("EE").build();
		build.forEach(System.out::println);
		//stream.generate()
		Stream<String> limit = Stream.generate(()->"Hii").limit(10);
		limit.forEach(System.out::println);
		
		
		System.out.println("------------------------------------");
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		System.out.println("-----------");
		IntStream rangeClosed = IntStream.rangeClosed(1, 6);
		rangeClosed.forEach(System.out::println);
		System.out.println("----------");
		LongStream range2 = LongStream.range(1, 4);
		range2.forEach(System.out::println);
		LongStream range3 = LongStream.rangeClosed(1, 4);
		range3.forEach(System.out::println);
		
		Random random = new Random();
		DoubleStream doubles = random.doubles(5);
		doubles.forEach(System.out::println);
		
		System.out.println("-------------");
		IntStream chars = "abcd".chars();
		chars.forEach(System.out::println);
	}

}
