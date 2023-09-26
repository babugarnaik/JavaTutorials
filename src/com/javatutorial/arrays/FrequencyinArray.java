package com.javatutorial.arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class FrequencyinArray {
	public static void main(String[] args) {
		int count=0;
		int max=67;
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(10, 34, 67, 34, 67, 34,67,67));
		for(int i=0; i<ar.size(); i++) {
			if(max==ar.get(i)) {
				count++;
				
			}
		}
		System.out.println("frequency of the number is :"+count);
		
	}
}

