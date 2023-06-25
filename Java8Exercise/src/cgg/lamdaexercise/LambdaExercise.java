package cgg.lamdaexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaExercise {

	static List<String> countries =new ArrayList<String>();
	static Map<String,String> countryCapitals=new HashMap<String,String>();
	
	static {
		countries.add("India");
		countries.add("France");
		countries.add("Nepal");
		countries.add("Russia");
		countries.add("Italy");
		countries.add("Australia");
		countries.add("Greenland");
		countryCapitals.put("India", "Delhi");
		countryCapitals.put("France", "Paris");
		countryCapitals.put("Nepal", "Kathmandu");
		countryCapitals.put("Russia", "Moscow");
		countryCapitals.put("Italy", "Rome");
	}
	
	static void displayCountries() {
		countries.forEach(System.out::println);
	}
	static void displayCountryCapitals() {
		countryCapitals.forEach((x,y)->System.out.println("Key : "+x+"\t Value : "+y));
	}
	static void sortCountriesByName() {
		countries.sort((c1,c2)->c2.compareTo(c1));
		countries.forEach(System.out::println);
		
	}
	static void sortCountriesBylength() {
//		countries.sort((c1,c2)->c2.length()-c1.length());
		Comparator<String> comp = Comparator.comparingInt(String::length).reversed();
		Collections.sort(countries,comp);
		countries.forEach(System.out::println);
		
	}
	static void removeCountry(String name) {
		if(name.length()>6)
		{
			Boolean val=countries.remove(name);
			System.out.println(val);
		}
	}
	
	
}
//In the class LambdaExercise, create following static variables
//1. countries of type List<String>
//2. countryCapitals of type Map<String, String>  
//
//In a static block, initialize countries and countryCapitals with some values
//
//Define following static methods and provide the implementation as given below
//
//- displayCountries
//- Iterate through the List and display the list using forEach(Consumer) method
//
//- displayCountryCapitals
//- Iterate through the Map and display the map using forEach(BiConsumer) method
//
//- sortCountriesByName
//- Sort the List using Comparator(Lambda Exp). Sort in the reverse alphabetical order
//
//- sortCountriesBylength
//- Sort the List using Comparator, in descending order of number of characters in the country name.
//If the number of characters are same for a country, it should be sorted alphabetically
//(Use Comparator's static/default methods)
//
//- removeCountry(String name)
//- remove the countries whose name is greater than 6 characters
//
//
//Execute the methods and display the results in main method 