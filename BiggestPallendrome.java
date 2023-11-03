package com.practice;

public class BiggestPallendrome {
	public static void main(String[] args) {
		String pallendrome = "madam gagag palapalap";
		String[] split = pallendrome.split(" ");
		findingBiggestPallendrome(split);

	}

	private static void findingBiggestPallendrome(String[] split) {
		String biggestPallendrome = "";

		for (int i = 0; i < split.length; i++) {
			String temp="";
			for (int j = i + 1; j < split.length; j++) {
				if (split[i].length() < split[j].length()) {
					temp = split[i];
					split[i] = split[j];
					split[j] = temp;
				}
			}
			System.out.println(split[i]);
			biggestPallendrome = split[0];
		}
		System.out.println("Biggest pallendrome is : " + biggestPallendrome);

	}

}
