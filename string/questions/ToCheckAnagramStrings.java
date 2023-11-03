package com.practice.string.questions;

import java.util.Arrays;

public class ToCheckAnagramStrings {
	public static void main(String[] args) {
		String s="listen";
		String s1="silent";
		tocheckAnagramStrings(s,s1);
	}

	private static void tocheckAnagramStrings(String s, String s1) {
           char[] charArray = s.toCharArray();
           Arrays.sort(charArray);
           char[] charArray2 = s1.toCharArray();
           Arrays.sort(charArray2);
         String sortedString1 = String.valueOf(charArray);
         String sortedStrin2 = String.valueOf(charArray2);
         if(sortedString1.equals(sortedStrin2)) {
        	 System.out.println("given strings are anagrams");
         }else {
        	 System.out.println("given strings are not anagrams");
         }
        
          
          
	}

}
