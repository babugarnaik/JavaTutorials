package com.javatutorial.arrays;

public class StringExample {

	public static void main(String[] args) {
		
		
		String str2 = "Babu";
		String str1 = new String("Babu");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
