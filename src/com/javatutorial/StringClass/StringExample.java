package com.javatutorial.StringClass;

public class StringExample {

	public static void main(String[] args) {
		//creating 2 string literals
		
		String str1 = "Welcome";
		String str2 = "Welcome"; //here java will not create a new value, rather refer to the value created in above line
		
		System.out.println("Reference check: "+(str1 == str2)); //checking for reference
		System.out.println("Value Check: "+str1.equals(str2)); //checking for value
		
		
	}

}
