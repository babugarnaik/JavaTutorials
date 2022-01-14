package com.javatutorial.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class KangaroosJump {

	public static void main(String[] args) {
		
		int x1 =0, v1=3, x2= 4, v2= 2;
		
		int sum1=x1, sum2=x2;
		boolean flag = false;
		for(int i=1; i<10000; i++) {
			sum1 += v1;
			sum2 += v2;
			if(sum1 == sum2) {
				flag = true;
				System.out.println("Yes");
				break;
			}
		}
		if(flag == false) {
			System.out.println("No");
		}

	}

}
