package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import net.mindview.util.Generator;

class MovieNameGenarator implements Generator<String> {
	String[] character = { "Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy", "Bashful", "Snow White",
			"Witch Queen", "Prince" };

	int next;

	@Override
	public String next() {
		String r = character[next];
		next = (next + 1) % 10;
		return r;
	}
}

public class Chapter11Exercise04 {
	protected final static MovieNameGenarator genarator = new MovieNameGenarator();

	static String[] fill(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = genarator.next();
		}
		return strings;
	}

	static Collection<String> fill(Collection<String> collection) {
		for (int i = 0; i < 10; i++) {
			collection.add(genarator.next());
		}
		return collection;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(fill(new String[10])));              // insert order
		System.out.println(fill(new ArrayList<String>()));     // insert order
		System.out.println(fill(new LinkedList<String>()));    // insert order
		System.out.println(fill(new HashSet<String>()));       // no order
		System.out.println(fill(new LinkedHashSet<String>())); // insert order
		System.out.println(fill(new TreeSet<String>()));       // compare order
	}
}
