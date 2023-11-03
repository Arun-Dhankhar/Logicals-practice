package com.practice;

import java.util.List;

public class FindingMaxAndMinInList {
public static void main(String[] args) {
	List<Integer> list = List.of(1,3,4,5,6,5,4,3,2,7,8,8);
	Integer max = list.stream().max((x,y)->x.compareTo(y)).orElseThrow();
	System.out.println("max element:"+ max);
	Integer min = list.stream().min((x,y)->x.compareTo(y)).orElseThrow();
	System.out.println("min element:"+ min);

	
} 
}
