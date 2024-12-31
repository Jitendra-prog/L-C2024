package Assignment2;

import java.util.*;

public class AdjacentCountries {
	static Map<String, List<String>> countryAdjacency = new HashMap<>();
	
	public static void printAdjacentCountries(String countryCode){
		if (countryAdjacency.containsKey(countryCode)) {
            List<String> adjacentCountries = countryAdjacency.get(countryCode);
            if (adjacentCountries.isEmpty()) {
                System.out.println("No adjacent countries found for the provided code.");
            } else {
            	String result = "";
            	for(int i = 0;i<adjacentCountries.size();i++) {
            		result += ", " + adjacentCountries.get(i);
            	}
                System.out.println("Adjacent countries for " + countryCode + ": " + result);
            }
        } else {
            System.out.println("Invalid country code or no data available.");
        }
	}
	
	public static void main(String[] args) {
		countryAdjacency.put("IN", List.of("Pakistan", "China", "Nepal", "Bangladesh", "Bhutan", "Myanmar", "Afghanistan"));
	    countryAdjacency.put("US", List.of("Canada", "Mexico"));
	    countryAdjacency.put("NZ", List.of());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a country code (e.g., IN/US/NZ): ");
		String countryCode = sc.next();
		printAdjacentCountries(countryCode);
		sc.close();
	}
    
}
