package com.practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class GettingDistinctCharacterAndTheirCount {
	public static void main(String[] args) {
		String s = "hllo this is a demo string to check character and their count";
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (lhm.containsKey(ch)) {
				lhm.put(ch, lhm.get(ch) + 1);
			} else {
				lhm.put(ch, 1);
			}

		}
		
		for(Entry<Character,Integer> entry:lhm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue() );
		}
	}
}
