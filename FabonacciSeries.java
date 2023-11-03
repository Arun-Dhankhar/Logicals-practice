package com.practice;

import java.util.Scanner;

public class FabonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no upto which you want to print fabonacci series");
		   int no = sc.nextInt();
		printFabonacciSeries(no);
	}

	private static void printFabonacciSeries(int no) {
		      int first=0;
		      int second=1;
		      int next=0;
		      System.out.println("Fabonacci Series of : "+ no+" is :-> ");
		      for(int i=2;i<=no;i++) {
		    	  next=first+second;
		    	  first=second;
		    	  second=next;
		    	  System.out.print( next+" ");
		      }
	}

}
