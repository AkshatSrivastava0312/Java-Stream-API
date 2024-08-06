package com.java.stream.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumOfTopThreeLargestOddNumsInList {
	
	// find sum of top 3 largest odd numbers in list
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,1,2,4,10,12,0,9,6,11,15,22,5);
		
		long result = list.stream()
						.filter(n -> n%2 == 1)
						.sorted(Comparator.reverseOrder())
						.limit(3)
						.reduce(0, (a,b) -> a+b);
		
		System.out.println(result);
		
	}

}