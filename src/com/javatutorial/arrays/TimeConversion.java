package com.javatutorial.arrays;

public class TimeConversion {

	public static void main(String[] args) {
		
		//given input in 12 hour format. need to convert to 24hour format
		String time12Hour = "05:00:00PM";
		String time24Hour = new String();
		boolean am = time12Hour.contains("AM")?true:false;
		
		if(am) {
			if(Integer.valueOf(time12Hour.substring(0, 2)) == 12) {
				time24Hour = new String("00"+time12Hour.substring(2,time12Hour.length()-2));
			}else {
				time24Hour = new String(time12Hour.substring(0,time12Hour.length()-2));
			}
		}else {
			if(Integer.valueOf(time12Hour.substring(0, 2)) == 12) {
				time24Hour = new String("12"+time12Hour.substring(2,time12Hour.length()-2));
			}else {
				time24Hour = new String((Integer.valueOf(time12Hour.substring(0,2))+12)+time12Hour.substring(2,time12Hour.length()-2));
			}
		}
		System.out.println(time24Hour);

	}

}
