package com.javatutorial.oops;

public class IfElse {

	public static void main(String[] args) {
		
	int number = 10;
	
	//Normal if-else example
	if(number%2==0) {    //condition to check whether a number is even or odd.
		System.out.println("Number is even");
	}else {
		System.out.println("Number is odd");
	}
	
	//if-else ladder	
	if(number%2 == 0) {
		System.out.println("Number is divisible by 2");
	}else if(number%3==0) {
		System.out.println("Number is divisible by 3");
	}else if(number%4 == 0) {
		System.out.println("Number is divisible by 4");
	}else {
		System.out.println("Number is not divisible by 2, 3 or 4");
	}

	}

}
