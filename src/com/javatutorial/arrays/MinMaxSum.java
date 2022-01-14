package com.javatutorial.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSum {
	
	//program to print the sum of max 4 numbers and sum of min 4 numbers in a 5 numbered list
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(10,10,9,2,2,5)); //36, 28
		List<String> stringList = arr.stream()
									 .map(a -> String.valueOf(a))
									 .collect(Collectors.toList());
		//streaming to find out max and min numbers in an arraylist
		System.out.println(stringList);
		
		//finding the max and min numbers in the list
		long max = stringList.stream().mapToLong(a -> Long.parseLong(a)).max().getAsLong();
		long min = stringList.stream().mapToLong(a -> Long.parseLong(a)).min().getAsLong();
		System.out.println(min+" "+max);
		
		//finding the max and min frequency in the list
		int maxfreq = Collections.frequency(stringList, String.valueOf(max));
		int minFreq = Collections.frequency(stringList, String.valueOf(min));
		
		//adding numbers expect max number(frequency =1)
		long minSum = stringList.stream()
								.filter(a -> Long.parseLong(a)!=max)
								.mapToLong(Long::parseLong)
								.sum() + ((maxfreq-1) *max);
		
		//adding numbers expect min number(frequency =1)
		long maxSum = stringList.stream()
						 .filter(a -> Long.parseLong(a)!=min)
						 .mapToLong(Long::parseLong)
						 .sum() + ((minFreq-1)*min);
		
		System.out.println("Min sum: "+minSum);
		System.out.println("Max sum: "+maxSum);

	}

}
