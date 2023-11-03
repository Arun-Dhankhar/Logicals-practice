package com.practice;


import java.util.stream.Stream;

public class EliminateDuplicateCharactersFromString {
	public static void main(String[] args) {
		String s="aaabbbbccc";
		Character[] ch = new Character[s.length()];
		for(int i=0;i<s.length();i++){
			 ch[i] = s.charAt(i);
		}
		
		Stream.of(ch).distinct().forEach(System.out::print);
		
   	}
}
