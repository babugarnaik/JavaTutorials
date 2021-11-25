package com.javatutorial.arrays;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RatioOfPositiveNegativeInArray {

	//this program is to find out the ratio of postive, negative and zero in a list
	public static void main(String[] args) {
		
		//sample arrays to test
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,1,0,-1,-1));
		List<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(-4,3,-9,0,4,1));
		
		//below 3 lines count the number of positive, negative and zeros in the list
		double countPos = arr2.stream().filter(a -> a>0).count();
		double countNeg = arr2.stream().filter(a -> a<0).count();
		double countZero = arr2.stream().filter(a -> a==0).count();
		
		//printing the ratios upto 5 decimal places
		System.out.println("Positive Number Ratio: "+String.format("%.5f", countPos/arr2.size()));
		System.out.println("Negative Number Ratio: "+String.format("%.5f", countNeg/arr2.size()));
		System.out.println("Zeros Ratio: "+String.format("%.5f", countZero/arr2.size()));
	}

}
