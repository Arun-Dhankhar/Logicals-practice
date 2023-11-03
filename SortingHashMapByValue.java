package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortingHashMapByValue {
    public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("arun", 5);
		hm.put("monika", 4);
		hm.put("raksha", 43);
		hm.put("sasa",32);
		
		LinkedHashMap<String,Integer> collect = hm.entrySet().stream().sorted((x,y)->x.getValue().compareTo(y.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(x,y)->x , LinkedHashMap::new));
	     for(Entry<String,Integer> entry:collect.entrySet()) {
	    	 System.out.println(entry.getKey()+" "+ entry.getValue());
	     }
    }
}
