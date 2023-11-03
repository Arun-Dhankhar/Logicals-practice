package com.practice;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(11);
		ll.add(33);
		ll.add(43);
		ll.add(37);
		ll.add(23);
		ll.add(88);
		System.out.println(ll);
		reverseLinkedList(ll);
	}

	private static void reverseLinkedList(LinkedList<Integer> ll) {
                LinkedList<Integer> reversedll=new LinkedList<>();
                for(int i=ll.size()-1;i>=0;i--) {
                	reversedll.add(ll.get(i));
                }
                System.out.println("reversed Linked List : "+ reversedll);
				/*
				 * Collections.reverse(ll); System.out.println(ll);
				 */
	}
	
	

}
