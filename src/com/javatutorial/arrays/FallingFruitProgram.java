package com.javatutorial.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FallingFruitProgram {

	public static void main(String[] args) {

		int s=7, t=11, a=5, b=15;
		
		List<Integer> apples = Arrays.asList(-2, 2, 1);
		List<Integer> oranges = Arrays.asList(5, -6);
		
		Long appleCount =  apples.stream()
			.filter(ob -> ob+a>=s &&ob+a<=t)
			.count();
		System.out.println(appleCount);
		Long orangeCount =  oranges.stream()
				.filter(ob -> ob+b>=s && ob+b<=t)
				.count();
		System.out.println(orangeCount);
	}

}
