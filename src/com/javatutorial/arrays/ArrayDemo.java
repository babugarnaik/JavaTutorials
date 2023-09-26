package com.javatutorial.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int num = 10;
		int[] arr = new int[] {56, 21, 30, 99};
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				System.out.println("Number " + num + " is present");
				flag = true;
				break;
			}else {
				System.out.println("Number " + num + " is not present");
			}
		}
//		if(flag == true) {
//			System.out.println("Number " + num + " is present");
//		}else {
//			System.out.println("Number " + num + " is not present");
//		}
		
	}

}
