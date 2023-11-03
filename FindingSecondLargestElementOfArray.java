package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindingSecondLargestElementOfArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		  Integer integer = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElseThrow();
		  System.out.println(integer);
	}
}
