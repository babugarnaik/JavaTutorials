package com.javatutorial.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//incomplete
public class BestSpotHackerrank {

	public static void main(String[] args) {
		
		List<ArrayList<Integer>> heights = new ArrayList<ArrayList<Integer>>();
		heights.add(new ArrayList<Integer>(Arrays.asList(19,19,-12)));
		heights.add(new ArrayList<Integer>(Arrays.asList(5,8,-14)));
		heights.add(new ArrayList<Integer>(Arrays.asList(-12,-11,9)));
		
		List<ArrayList<Integer>> store = new ArrayList<ArrayList<Integer>>();
		store.add(new ArrayList<Integer>(Arrays.asList(-18,-12)));
		store.add(new ArrayList<Integer>(Arrays.asList(-10,-7)));
		
		int h = store.size();
		int w = store.get(0).size();
		ArrayList<Integer> sumList = new ArrayList<Integer>();
		

		int i = 0;
		for(ArrayList<Integer> arr: heights) {
			
			for(int val:arr.subList(i, i+h)) {
				
			}
		}
		int sum = 0;
		for(int j=0;j<w;j++) {
			//for(int k=0;k<h;k++) {
				sum = sum+ heights.subList(i, i+h).get(j).get(j) + store.get(j).get(j);
		//	}
		}
		System.out.println(sum);

	}

}
