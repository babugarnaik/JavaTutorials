package com.javatutorial.oops;

public class Math {
	
		public static void main(String[] args) {
			int i;
		
		for (i=1; i<=100; i++) {
			if(i%2==0 && i%4!=0 && i%6!=0) {
				System.out.println("R" +i);
			}
			if(i%4==0&&i%2==0 && i%6!=0) {
				System.out.println("A" +i);
			}
			if(i%6==0&&i%2==0 &&i%4!=0) {
				
				System.out.println("B"+i);
			}
		}

}
}