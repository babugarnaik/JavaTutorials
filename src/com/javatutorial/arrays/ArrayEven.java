package com.javatutorial.arrays;

public class ArrayEven {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = new int[] {56,86,10,47, 85, 44};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);

		
	}

}
