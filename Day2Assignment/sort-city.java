package java8.day2;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;


public class SortCitiesClass {
	
	public static void main(String[] args) {

	  List<String> citiesList = Arrays.asList("Tokyo" ,"Mysore", "Bangalore" , "Pune" , "Kolkata", "Chennai");
    List<String> sortedList = cityList.stream().sorted().collect(Collectors.toList());
	  
	  System.out.println("Sorted: " + sortedList);
  }
}
