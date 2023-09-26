package com.javatutorial.arrays;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
	}

}
