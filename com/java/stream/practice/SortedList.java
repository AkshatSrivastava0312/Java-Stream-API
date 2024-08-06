package com.java.stream.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,1,2,5,6,4,9,8,7,11,10,14,12,17,15);
		
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		
		sortedList.forEach(n -> System.out.print(n + " "));	

	}

}
