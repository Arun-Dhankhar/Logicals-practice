package com.practice.string.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrderNamesInAscOrder {
       public static void main(String[] args) {
    	   String str="arun nura monika preeti deepak";
    	   String[] split = str.split(" ");
    	   List<String> list = Arrays.asList(split);
		ArrayList<String> arrlist=new ArrayList<>(list);
		    arrlist.stream().sorted().forEach(System.out::println);
	}
}
