package com.practice;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 7;
		int index=binarySearch(arr, target);
		System.out.println("given target: " + target+ "  is found at index:  " + index );

	}

	private static int binarySearch(int[] arr, int target) {
            return binarySearch(arr,target,0,arr.length-1);
	}
	private static int binarySearch(int[] arr,int target,int left,int right) {
	      int mid=(left +(right-left)/2);
	      if(mid>right)return -1;
	      if(arr[mid]==target)return mid;
	      if(target<arr[mid])return binarySearch(arr,target,0,mid-1);
	      if(target>arr[mid]) return binarySearch(arr,target,mid+1,right);
	      return -1;
	}
}
