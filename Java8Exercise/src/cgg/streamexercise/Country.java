package cgg.streamexercise;

public class Country {
private int countryId;
private String countryName;
public Country(int countryId, String countryName) {
	super();
	this.countryId = countryId;
	this.countryName = countryName;
}
public int getCountryId() {
	return countryId;
}
public String getCountryName() {
	return countryName;
}
@Override
public String toString() {
	return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
}


}		
//	- getMaxRunsPlayer
//		Return the player who has scored maximum runs	
