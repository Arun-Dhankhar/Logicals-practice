package com.practice;

public class CheckPallendromeString {
	public static void main(String[] args) {
		String str = "madam";
		String rev="";
	boolean b=	checkPallendrome(str,rev);
	if(b) {
		System.out.println("given strings are pallendrome");
		
	}else {
		System.out.println("given strings are not pallendrome");
	}
    }

	private static boolean checkPallendrome(String str,String rev) {
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))return true;
		
		return false;
	}
}
