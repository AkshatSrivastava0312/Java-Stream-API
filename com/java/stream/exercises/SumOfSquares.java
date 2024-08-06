package com.java.stream.exercises;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
	
	// find sum of squares of numbers in the list	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,1,2,5,4);
		
		long result = list.stream().map(n -> n * n).reduce(0, (a, b) -> a + b);
		
		System.out.println(result);
		
		

	}

}
