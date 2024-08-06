package com.java.stream.practice;

import java.util.Arrays;
import java.util.List;

public class ReduceList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,1,2,5,6,4,9,8,7,11,10,14,12,17,15);
		
		// Sum of all elements in list		
		int sum = list.stream().reduce(0, (a,b) -> a+b);
		
		System.out.println(sum);		
		

	}

}
