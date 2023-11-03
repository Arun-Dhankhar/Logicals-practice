package com.practice;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of check prime or not");
		int no = sc.nextInt();
		boolean b = checkPrime(no);
		
		if(b) {
			System.out.println("given no is a prime no");
		}else {
			System.out.println("given no is not a prime no");
		}
	}

	private static boolean checkPrime(int no) {
		if (no < 2)
			return false;
             for(int i=2;i<=no/2;i++) {
            	 if(no%i==0) {
            		 return false;
            	 }
             }
		return true;
	}

}
