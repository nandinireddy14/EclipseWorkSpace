package cgg.lamdaexercise;

public class LambdaMain {

	public static void main(String[] args) {
		LambdaExercise.displayCountries();
		System.out.println("---------------");
		LambdaExercise.displayCountryCapitals();
		System.out.println("---------------");
		LambdaExercise.sortCountriesByName();
		System.out.println("---------------");
		LambdaExercise.removeCountry("Greenland");
		System.out.println("------------");
		LambdaExercise.displayCountries();
		
		LambdaExercise.sortCountriesBylength();
	}

}
