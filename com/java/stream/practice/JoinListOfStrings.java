package com.java.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfStrings {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		
		String joinedString = list.stream().collect(Collectors.joining("||"));
		
		System.out.println(joinedString);		

	}

}
