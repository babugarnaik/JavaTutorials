package com.javatutorial.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		List<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>(Arrays.asList(11,2,4)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(10,8,-12)));
		
		System.out.println("Size of square matrix: "+matrix.size());
		int len = matrix.size();
		int left=0,right=0,countB=len;
		for(int i=0; i<len; i++) {
			left = left+matrix.get(i).get(i);
			right = right+matrix.get(i).get(countB-1);
			countB--;
		}
		System.out.println("Printing the array");
		for(ArrayList<Integer> ar: matrix) {
			System.out.println(ar);
		}
		
		System.out.println("Sum of left diagonal: "+left);
		System.out.println("Sum of right diagonal: "+right);
	}

}
