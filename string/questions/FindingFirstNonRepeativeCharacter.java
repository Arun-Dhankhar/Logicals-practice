package com.practice.string.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindingFirstNonRepeativeCharacter {
	public static void main(String[] args) {
		String s = "java";
		findingFirstNonRepeativeCharacter(s);
	}

	private static void findingFirstNonRepeativeCharacter(String s) {
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				Character key = entry.getKey() ;
				System.out.println(key);
			}

		}
	}
}
