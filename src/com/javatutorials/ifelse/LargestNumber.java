package com.javatutorials.ifelse;

public class LargestNumber {

	public static void main(String[] args) {

		int num1=10, num2=78 ,num3=45;
		
		if(num1<num2 && num2<num3 ) {
			System.out.println("greatest number is: "+num3);
		}else if(num2<num3) {
			
			System.out.println("greatest number is: "+num2);
		}else {
			System.out.println("gretest number is"+num1);
		}
			
		
	}

}
