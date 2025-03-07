package com.java.stream.exercises;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumsinList {
	
	// find sum of even numbers in list
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		long result = list.stream().filter(n -> n%2 == 0).reduce(0, (a,b) -> a+b);
		
		System.out.println(result);		

	}

}
