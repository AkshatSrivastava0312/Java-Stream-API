package com.java.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElementsInList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,1,3,1,2,4,4,7,4,1,3,8,9,3,4,7);
		
		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
		
		distinctList.forEach(n -> System.out.print(n + " "));

	}

}
