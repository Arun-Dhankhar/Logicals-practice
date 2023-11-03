package com.practice;

public class VowelCheck {
	public static void main(String[] args) {
		String s = "thisisastringcontainingvowels";
	
		int i = toCheckVowels(s);
		if(i>0) {
			System.out.println("vowels found " + i);
		}else {
			System.out.println("no vowels found");
		}

	}

	private static int toCheckVowels(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				
					
			}
		}
		return count;
	}

}
