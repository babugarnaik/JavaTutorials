package com.javatutorial.arrays;

public class ArrayinPrime {

	public static void main(String[] args) {
		int[] ar = new int[] {22,13,14,78,90};
		
		for (int i = 0; i < ar.length; i++) {
			int count = 0;

			for (int j = 1; j <= ar[i]; j++) {
				if (ar[i] % j == 0) {
					count++;
				}

			}
			if (count <= 2) {
				System.out.println(ar[i]+" is prime");

			}else {
				System.out.println(ar[i]+" is not prime");
			}
		}
	}
}