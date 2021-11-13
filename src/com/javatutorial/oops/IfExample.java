package com.javatutorial.oops;

public class IfExample {
	public static void main(String args[]) {
		int n=3;
		if(n%2!=0) {
		System.out.println("weird");
	}
		if(n%2==0 && n<=5 && n>=2) {
			System.out.println("Not wierd");
		}
	    if(n%2==0 && n<=20 && n>=6) {
	    	System.out.println("wierd");
	    }
	    if(n%2==0 && n>20) {
	    	System.out.println("Not Wierd");
	    }
	}
}
