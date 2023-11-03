package com.practice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
        System.out.println("Enter no. to print factorial of : ");
        try (Scanner sc = new Scanner(System.in)) {
			int no = sc.nextInt();
			 toPrintFactorial(no);
		}
	}

	private static void toPrintFactorial(int no) {
         int factorial =1;
		for(int i=1;i<=no;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of : "+ no+ "  is :" +factorial);
	}
}
