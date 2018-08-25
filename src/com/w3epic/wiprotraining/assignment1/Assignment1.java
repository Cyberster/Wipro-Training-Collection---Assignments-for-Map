/*
1. 	Develop a java class with a instance variable CountryMap  HashMap (M1)  
	add a method saveCountryCapital(String CountryName, String capital) , 
	the method should add the passed country and capital as key/value in 
	the map M1 and return the Map (M1).

Key- Country				Value - Capital
India						Delhi
Japan						Tokyo

2. 	Develop a method getCapital(String CountryName) which returns the capital 
	for the country passed from the Map M1 created in step 1.
	
3. 	Develop a method getCountry(String capitalName) which returns the country 
	for the capital name passed from the Map M1 created in step 1.
	
4. 	Develop a method which iterates through the map M1 and creates another map 
	M2 with Capital as the key and value as Country and returns the Map M2.
	
Key – Capital				Value – Country
Delhi						India
Tokyo						Japan

5. 	Develop a method which iterates through the map M1 and creates an ArrayList 
	with all the Country names stored as keys. This method should return the ArrayList.
	
NOTE: You can test the methods using a main method.
 */

package com.w3epic.wiprotraining.assignment1;

import java.util.HashMap;

public class Assignment1 {

	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		HashMap<String, String> M2 = countryMap.swapKyeValue();
		System.out.println(M2);
	}

}
