package cgg.streampipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipeline {
public static void main(String[] args) {
	Stream<String> onceModifiedStream = Stream.of("abcd","jhjk","ghjhk","huuu").skip(1);
	onceModifiedStream.forEach(System.out::println);
	
	Stream<String> stream = Stream.of("abcd","jhjk","ghjhk");
	Stream<String> twiceModifiedStream = stream.skip(1).map(e->e.substring(0,3));
	twiceModifiedStream.forEach(System.out::println);
	
	System.out.println("----------------------");
	List<String> list = Arrays.asList("ac1","asda","sasw");
	long count = list.stream().skip(1).map(e->e.substring(0, 3)).sorted().count();
	System.out.println(count);
}
}
