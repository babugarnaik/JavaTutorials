package com.javatutorial.arrays;

import java.util.Scanner;

public class InsertElements {

	public static void main(String[] args) {
	
		int [] ar1=new int [5];
		System.out.println("Enter the elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("Printing elements before insert");
		for(int i:ar1) {
			System.out.println(i);
		}
		System.out.println("Enter the location at which we want to insert");
		int location=sc.nextInt();
		
		System.out.println("Enter the value at which we want to insert");
		int value=sc.nextInt();
		for(int i=ar1.length-1;i>location;i--) {
			ar1[i]=ar1[i-1];
		}
		ar1[location]=value;
		
	for(int i:ar1) {
		System.out.println(i);
	}
	}
}
