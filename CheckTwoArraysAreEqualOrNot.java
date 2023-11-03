package com.practice;

import java.util.Arrays;

public class CheckTwoArraysAreEqualOrNot {
   public static void main(String[] args) {
	int[] arr1= {2,3,4,5,6,7,8,9,10};
	int[] arr2= {2,3,4,5,6,7,8,9,10};
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	boolean b = checkTwoArraysAreEqualOrNot(arr1,arr2);
	if(b) {
		System.out.println("Array1 "+Arrays.toString(arr1)+" Array2 "+ Arrays.toString(arr2)+" both arrays are equal");
	}else {
		System.out.println("Array1 "+Arrays.toString(arr1)+" Array2 "+ Arrays.toString(arr2)+" both arrays are not equal");

	}

}

private static boolean checkTwoArraysAreEqualOrNot(int[] arr1, int[] arr2) {
	
	 if(arr1.length!=arr2.length)return false;

	         for(int i=0;i<arr1.length;i++) {
	        	 if(arr1[i]!=arr2[i]) {
	        		 return false;
	        		 
	        	 }
	         }
	         return true;
	
}
}
