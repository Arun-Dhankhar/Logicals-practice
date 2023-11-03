package com.practice;

public class ReplaceWildCharactersInString {
	public static void main(String[] args) {
		String s="^j@#$%a&#@v@@%^Aa";
		String replaceAll = s.replaceAll("[^a-zA-Z0-9]", "");
		 System.out.println(replaceAll);
		
 	}
}
