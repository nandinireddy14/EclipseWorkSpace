package cgg.streamexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationsExercise {
	static List<Player> players=new ArrayList<Player>();
	public static void main(String[] args) {
		Country c1 = new  Country(1,"India");
		Country c2 = new  Country(2,"France");
		Country c3 = new  Country(3,"US");
		players.add(new Player("abc",2,51000,220,c1));
		players.add(new Player("def",1,11270,90,c1));
		players.add(new Player("ghi",3,51000,300,c2));
		players.add(new Player("jkl",0,20,90,c3));
		players.add(new Player("ghi",1,4080,90,c2));
		
//		Display the names of all players
//		displayPlayers();
		
//		System.out.println("-----------------------------------------------------------------------");
		
//		displayPlayersForCountry("India");
//		Display the name of players whose highest score is more than 100 and belong to a particular country
		
//		System.out.println("-----------------------------------------------------------------------");


//		System.out.println("-----------------------------------------------------------------------");

		
//		System.out.println(getAverageRunsByCountry("France"));
//		Return the average runs scored by players from a particular Country
		
		
//		findPlayer("abc","India").forEach(System.out::println);;
//		Search and return the player for a given name and country 
		
//		System.out.println(checkHighScorerByCountry("India"));
//	  	Find whether there is any player in the given country who has scored more than 10000 runs. Return a boolean. 

//		getPlayerNames().forEach(System.out::println);;
//		Return a LinkedList containing names of all Players, whose have scored more than 5000 runs, sorted in descending order of names

//		 getPlayerNamesSorted().forEach(System.out::println);
//			Return a list with names of Players sorted as per country and then by matchesPlayed(descending)
		
//		getPlayerCountry().forEach((k,v)->System.out.println(k+"\t"+v));;
//			return a map with the PlayerName and CountryName of all players who have played more than 200 matches
		
		getMaxRunsPlayer().forEach(System.out::println);
//		Return the player who has scored maximum runs	
		
	}

	
	private static List<Player> getMaxRunsPlayer() {
		Comparator<Player> comp = Comparator.comparing(Player::getRuns);
		 int runs = players.stream().collect(Collectors.maxBy(comp)).get().getRuns();
		List<Player> collect = players.stream().filter(x->x.getRuns()==runs).collect(Collectors.toList());
		return collect;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private static Map<String, String> getPlayerCountry() {
		
		Map<String, String> collect = players.stream().filter(x->x.getHighestScore()>200).collect(Collectors.toMap(Player::getPlayerName, (Player a)->a.getCountry().getCountryName()));
		return collect;
	}
	
	
	
	
	private static boolean checkHighScorerByCountry(String string) {
	boolean anyMatch = players.stream().anyMatch(x->(x.getCountry().getCountryName().equals(string))&&(x.getRuns()>10000));
	return anyMatch;	
	}
	private static Stream<Player> findPlayer(String string, String string2) {
			Stream<Player> filter = players.stream().filter(x->(x.getPlayerName().equals(string))&&(x.getCountry().getCountryName().equals(string2)));
			return filter;
	}

	private static List<Player> getPlayerNamesSorted() {
		Comparator<Player> reversed= Comparator.comparing(Player::getMatchesPlayed).reversed();
		Comparator<Player> thenComparing = Comparator.comparing((Player x)->x.getCountry().getCountryName()).thenComparing(reversed);

		Collections.sort(players,thenComparing);
		return players;
	}
	private static Double getAverageRunsByCountry(String string) {
		Double collect = players.stream().filter(x->x.getCountry().getCountryName().equals(string)).collect(Collectors.averagingInt(Player::getRuns));
		return collect;
	}
	private static LinkedList<String> getPlayerNames() {
		LinkedList<String> collect = players.stream().filter(x->x.getRuns()>5000).sorted((n1,n2)->n1.getPlayerName().compareTo(n2.getPlayerName())).map(x->x.getPlayerName()).collect(Collectors.toCollection(LinkedList::new));
		return collect;
	}
	private static void displayPlayersForCountry(String string) {
		Stream<Player> filter = players.stream().filter(x->x.getCountry().getCountryName().equals(string)).filter(x->x.getHighestScore()>100);
		filter.forEach(System.out::println);
	}
	private static void displayPlayers() {
		players.stream().forEach(System.out::println);
	}
	

}
//- Define a POJO class Player with playerName, matchesPlayed, runs, highestScore, Country as member variables
