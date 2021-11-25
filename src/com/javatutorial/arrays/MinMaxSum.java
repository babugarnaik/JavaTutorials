package com.javatutorial.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSum {
	
	//program to print the sum of max 4 numbers and sum of min 4 numbers in a 5 numbered list
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(256741038,256741038,256741038,256741038,256741038));
		
		//streaming to find out max and min numbers in an arraylist
		long max = arr.stream().max(Comparator.comparing(Integer::valueOf)).get();
		long min = arr.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min+" "+max);
		long minSum = arr.stream()
		.filter(a -> a!=max)
		.collect(Collectors.summingLong(Integer::longValue));
		System.out.println("min val: "+minSum);
		long maxSum = arr.stream()
				.filter(a -> a!=min)
				.mapToLong(Integer::longValue)
				.sum();
		
		System.out.println("Min sum: "+minSum);
		System.out.println("Max sum: "+maxSum);

	}

}
