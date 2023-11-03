package com.practice;

import java.util.List;

public class CheckOddElementInList {
          public static void main(String[] args) {
			List<Integer> of = List.of(1,2,3,4,5,6,7,8);
			of.stream().filter(p->p%2!=0).forEach(e->System.out.println("odd element found "+e));
			
		}
}
