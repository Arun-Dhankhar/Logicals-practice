package com.practice.string.questions;

public class CompareTwoStringWithoutBuildInMethod {
	public static void main(String[] args) {
		String s1 = "monika";
		String s2 = "monika";
		areEqual(s1, s2);
	}

	private static void areEqual(String s1, String s2) {
		boolean flag = false;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				flag = false;
				break;
			}
			flag = true;
		}
		if (flag) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}

}
