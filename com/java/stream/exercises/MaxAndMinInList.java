package com.java.stream.exercises;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinInList {

	
	// find max and min in the list
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,1,2,5,6,4,9,8,7,11,10,14,12,17,15);
		
		long maxValue = list.stream().reduce(Integer.MIN_VALUE,(a,b) -> a > b ? a : b);
		
		System.out.println(maxValue);
		
		long minValue = list.stream().reduce(Integer.MAX_VALUE, (a,b) -> a < b ? a : b);
		
		System.out.println(minValue);
		
	}

}
