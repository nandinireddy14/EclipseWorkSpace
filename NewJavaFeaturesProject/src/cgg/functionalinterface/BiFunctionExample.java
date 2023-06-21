package cgg.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
public static void main(String[] args) {
	BiFunction<Integer,Integer,String> biFunction=(n1,n2)->"Result : "+(n1+n2);
	System.out.println(biFunction.apply(12, 14));
}
}
