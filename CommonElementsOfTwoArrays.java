package com.practice;


import java.util.HashSet;


public class CommonElementsOfTwoArrays {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr1 = { 4, 5, 6, 7,8,9,10 };
		HashSet<Integer> hs = new HashSet<>();
		for (Integer i : arr) {
			hs.add(i);
		}
		for(Integer i:arr1) {
			if(hs.contains(i)) {
				System.out.println(i+ " ");
			}
		}
	}
}
