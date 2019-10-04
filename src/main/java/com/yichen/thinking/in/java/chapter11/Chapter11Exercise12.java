package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Chapter11Exercise12 {

	public static void main(String[] args) {
		List<Integer> ints1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		List<Integer> ints2 = new ArrayList<Integer>(ints1);
		ListIterator<Integer> it1 = ints1.listIterator();
		ListIterator<Integer> it2 = ints2.listIterator(ints1.size());
		
		while(it1.hasNext()) {
			it2.previous();
			it2.set(it1.next());
		}
		
		System.out.println(ints1);
		System.out.println(ints2);
	}

}
