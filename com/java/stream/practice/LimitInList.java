package com.java.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitInList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,1,2,5,6,4,9,8,7,11,10,14,12,17,15);
		
		// fetching first 5 elements in list
		List<Integer> limitList = list.stream().limit(5).collect(Collectors.toList());
		
		limitList.forEach(n -> System.out.print(n + " "));
		
	}

}
