package com.java.stream.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers{

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(3,1,2,5,6,4,9,8,7,11,10,14,12,17,15);
        
        List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        
        evenList.forEach(n -> System.out.print(n + " "));

    }

}