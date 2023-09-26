package com.javatutorial.arrays;

public class EvennuminArray {

	public static void main(String[] args) {

		int[] ar1 = new int[] { 12, 34, 56, 67, 78, 77, 80, 42, 17, 9, 1 };
		int count = 0;
		System.out.println("Elements in array 1:");
		for (int i = 0; i < ar1.length; i++) {

			System.out.print(ar1[i] + " ");

		}
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 == 0) {
				count++;
			}
		}
		int[] ar2 = new int[count];
		int count2 = 0;
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 == 0) {
				ar2[count2] = ar1[i];
				count2++;
			}
		}
		System.out.println();
		System.out.println("Elements in array 2:");
		for (int i = 0; i < ar2.length; i++) {

			System.out.print(ar2[i] + " ");

		}

	}
}
