package com.practice.string.questions;

import java.util.Arrays;
import java.util.List;

public class SortCharacterInString {
	public static void main(String[] args) {
                String s="character";
                
                sortingCharacters(s);
	}

	private static void sortingCharacters(String s) {
		char[] ch = s.toCharArray();
		Character[] charr= new Character[ch.length];
		for(int i=0;i<ch.length;i++) {
			charr[i]= ch[i];
		}
         
		List<Character> list = Arrays.asList(charr);
		list.stream().distinct().sorted().forEach(System.out::print);
		
	}
}
