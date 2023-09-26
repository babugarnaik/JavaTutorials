package com.javatutorial.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSearchelement {

	public static void main(String[] args) {
		int num = 39;
		boolean flag = false;
		
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(10, 34, 67, 78, 98, 43));
		for (int i = 0; i < ar.size(); i++) {
			if (num == ar.get(i)) {
			 flag = true;
				break;
			}

		}
		if (flag) {

			System.out.println("number is available");
		} else {
			System.out.println("number is not available");
		}
	}
}
