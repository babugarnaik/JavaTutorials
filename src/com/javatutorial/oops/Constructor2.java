package com.javatutorial.oops;

public class Constructor2 {
public static void main(String[]args) {
	Constructor X =new Constructor();
	System.out.println(X.getX());
	System.out.println(X.getY());
	System.out.println(X.getZ());
	
	System.out.println();
	
	
	Constructor P = new Constructor(9,6,"f");
	System.out.println(P.getX());
	System.out.println(P.getY());
	System.out.println(P.getZ());
	}
}
