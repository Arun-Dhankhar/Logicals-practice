package com.practice.string.questions;

public class CountingVowels {
	public static void main(String[] args) {
		String str = "Hello this is a string aaaa";
		countvowels(str);
	}

	private static void countvowels(String str) {
		int count=0;
		boolean flag=false;
		for (int i = 0; i < str.length(); i++) {
               char ch = str.charAt(i);
               switch(ch) {
               case 'a':
               case 'e':
               case 'i':
               case 'o':
               case 'u':
               case 'A':
               case 'E':
               case 'I':
               case 'O':
               case 'U':
            	   flag=true;
            	   count++;
            	   break;
            	   
               }
               
		}
		if(flag) {
     	   System.out.println("vowels found : "+count);
        }
	}

}
