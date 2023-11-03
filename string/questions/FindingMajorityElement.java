package com.practice.string.questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingMajorityElement {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 3, 3, 3, 3, 3, 3, 3 };
		findingMajortyElement(arr);
	}

	private static void findingMajortyElement(Integer[] arr) {
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();

		for (int i : arr) {
			if (lhm.containsKey(i)) {
				lhm.put(i, lhm.get(i) + 1);

			} else {
				lhm.put(i, 1);
			}
		}
		for (Entry<Integer, Integer> entry : lhm.entrySet()) {
			if (entry.getValue() > arr.length / 2) {
				System.out.println("Majorty element is :" + entry.getKey());
			}
		}
		/*
		 * Map<Integer, Long> collect = Arrays.asList(arr).stream()
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 * for (Entry<Integer, Long> entry : collect.entrySet()) { if (entry.getValue()
		 * > arr.length / 2) { System.out.println("mojorty element found: " +
		 * entry.getKey()); } }
		 */
	}

}
