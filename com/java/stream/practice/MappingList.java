package com.java.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,1,2,5,6,4,9,8,7,11,10,14,12,17,15);
		
		// Double all values in the list
		List<Integer> mappedList = list.stream().map(n -> n*2).collect(Collectors.toList());
		
		mappedList.forEach(n -> System.out.print(n + " "));	
		
	}

}
