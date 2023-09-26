package com.javatutorial.arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistPrimeNumber {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(12,45,67,89,13,47));

		for(int i=0; i<ar.size(); i++) {
			int count=0;
			
		for(int j=1; j<=ar.size(); j++) {
			if(ar.get(i)%j==0) {
				count++;
			}
		}
		if(count<=2){
			System.out.println(ar.get(i));
	}
		}
	}
		}


