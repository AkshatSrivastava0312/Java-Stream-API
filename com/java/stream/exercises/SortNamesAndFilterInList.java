package com.java.stream.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNamesAndFilterInList {

	// sort all the names in the list in alphabetical order and get the names having more than 6 letters
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ram", "Shyam", "Abhinav", "Bhushan", "Akshat", "Zakir", "Nilesh");
		
		List<String> sortedList = list.stream()
									.sorted()
									.filter(name -> name.length() > 6)
									.collect(Collectors.toList());
		
		sortedList.forEach(name -> System.out.print(name + " "));
				
	}

}
