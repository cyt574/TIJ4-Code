package com.yichen.thinking.in.java.chapter11;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Chapter11Exercise14 {

	public static void main(String[] args) {
		List<Integer> ints = new LinkedList<Integer>();
		
		ListIterator<Integer> it = ints.listIterator();
		for (int i = 1; i <= 10; i++) {
			it.add(i);
			if (i % 2 == 0) {				
				it.previous();
			}
		}
		System.out.println(ints);
	}

}
