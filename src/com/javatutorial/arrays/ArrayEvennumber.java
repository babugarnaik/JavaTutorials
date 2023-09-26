package com.javatutorial.arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEvennumber {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(10, 20, 12, 15, 23 ));
		for(int i=0; i<ar.size(); i++) {
			if(ar.get(i)%2==0) {
				System.out.println(ar.get(i));
				
			}
			
		}
	}

}
