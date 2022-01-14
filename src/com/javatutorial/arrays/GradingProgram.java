package com.javatutorial.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingProgram {

	public static void main(String[] args) {
		
		List<Integer> grades = new ArrayList<Integer>(Arrays.asList(84, 29, 57));
		System.out.println("grades before rounding: "+grades);
		grades = grades.stream()
					//.filter(a -> a+2 > 40)
					.map(r -> {
/*						if(r%5 == 0)
							return r;
						else */
						if(r+2 < 40) {
							return r;
						}else if((r+1) % 5 ==0) {
							return r+1;
						}else if((r+2) % 5 ==0) {
							return r+2;
						}else {
							return r;
						}
					})
					.collect(Collectors.toList());
		
		System.out.println("Grades after rounding: "+grades);
	}

}
