package com.javatutorial.arrays;

public class SearchInArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {15, 4, 26, 90, 6}; 
		
		int number = 4; //number to search in the array
		int count=0; //counter for incrementing in case number is present
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == number) {
				count ++;
				break;    //break the loop first time number is found
			}
		}
		
		if(count>0) {
			System.out.println("Number: "+number+" is present.");
		}else {
			System.out.println("Number: "+number+" is not present.");
		}
	}

}
