package com.javatutorial.arrays;

public class MaxNumInArray {

	public static void main(String[] args) {

		int[] arr = new int[] {23, 5, 78, 99, 2, 16, 19, 5, 67};
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest number in the array is: "+max);

	}

}
