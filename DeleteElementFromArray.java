package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Given array is :" + Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to delete from array");
		int target = sc.nextInt();
		deleteElement(arr, target);

	}

	private static void deleteElement(int[] arr, int target) {
		int[] newarr = new int[arr.length];
		System.out.println("Array after deletion the target element: ");
		for (int i = 0; i < arr.length-1; i++) {
			if (target == arr[i]) {
				continue;
			} else {
				newarr[i] = arr[i];
			}
			System.out.print(newarr[i]+" ");
		}
	}
}
