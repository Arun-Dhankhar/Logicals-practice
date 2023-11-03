package com.practice.string.questions;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String str = "remove duplicates remove";
		System.out.println("given string is: " + str);
		removeDuplicates(str);
		
	}

	private static void removeDuplicates(String str) {
		String distinct = "";
		char[] array = str.toCharArray();

		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		for (Character ch : array) {
			hs.add(ch);
		}
		Iterator<Character> iterator = hs.iterator();
		while (iterator.hasNext()) {
			distinct = distinct + iterator.next();
		}
		System.out.println("String after removing duplicates : " + distinct);

	}

}
