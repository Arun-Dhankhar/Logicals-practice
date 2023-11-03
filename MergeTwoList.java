package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 5; i < 15; i++) {
			list1.add(i);
		}
		
		list.addAll(list1);
		System.out.println(list);

	}
}
