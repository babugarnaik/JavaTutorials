package com.javatutorial.arrays;

public class ArraysExample1 {
	
	public static void main(String[] args) {
		//declaring an array of integers
		int[] arr = new int[5];
		
		//adding values to the array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//declaring array with initial value
		int[] arr2 = new int[] {1,2,3,4,5};
		
		//finding the length of array
		int length = arr.length;
		System.out.println("Length of array is: "+length);
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		//creating an array of size 100 and initializing it
		int size = 100;
		int[] arr3 = new int[size];
		int count = 1;
		for(int i = 0; i<size; i++) {
			arr3[i] = count;
			count ++;
		}
		System.out.println();
		
		//printing the values present in arr3
		for(int j = 0; j<size; j++) {
			System.out.print(arr3[j]+ " ");
		}
	}

}
