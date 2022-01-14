package com.javatutorial.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class NumbersBetweenArrays {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2,6));
		ArrayList<Integer> b = new ArrayList<>(Arrays.asList(24,36));
		int num=a.stream().max(Comparator.naturalOrder()).get();
		Integer numNew = new Integer(num);
		System.out.println("Num: "+num);
		for(int m: b) {
		for(int n: a) {
			if(num%n != 0 && m%num !=0) {
				num+=numNew;
			}			
		}
		}
		
		System.out.println(num);
		
	}

}
