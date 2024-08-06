package com.java.stream.practice;

import java.util.Arrays;
import java.util.List;

public class CountElementsInList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,1,2,5,6,4,9,8,7,11,10,14,12,17,15);
		
		long count = list.stream().count(); 
		
		System.out.println(count);	

	}

}
