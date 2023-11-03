package com.practice;

public class RotateAString {
   public static void main(String[] args) {
	String s="Paramanand";
	char charAt = s.charAt(s.length()-1);
	      String substring = s.substring(0, s.length()-1);
	      StringBuffer sb=new StringBuffer(substring);
	      StringBuffer rotated = sb.insert(0, charAt);
	      String string = rotated.toString();
	      System.out.println(string);
	      
	      
   }
}
