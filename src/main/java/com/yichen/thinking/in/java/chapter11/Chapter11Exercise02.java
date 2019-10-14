package com.yichen.thinking.in.java.chapter11;

import java.util.Set;
import java.util.TreeSet;

class SimpleCollection {
	public static void main() {
		Set<Integer> c = new TreeSet<Integer>();
		for (int i = 0; i < 10; i++) {
			c.add(i);
		}
		
		for (Integer integer : c) {
			System.out.print(integer + ", ");
		}
	}
}

public class Chapter11Exercise02 {

	public static void main(String[] args) {
		SimpleCollection.main();
	}

}
