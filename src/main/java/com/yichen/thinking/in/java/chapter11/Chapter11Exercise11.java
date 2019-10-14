package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Chapter11Exercise11 {

	public static void main(String[] args) {
		String[] strings = { "one", "two", "three", "four", "five", "six", "seven" };

		List<String> stringArrayList = new ArrayList<String>(Arrays.asList(strings));
		traverseCollection(stringArrayList);

		List<String> stringLinkedList = new LinkedList<String>(Arrays.asList(strings));
		traverseCollection(stringArrayList);

		Set<String> stringHashSet = new HashSet<String>(Arrays.asList(strings));
		traverseCollection(stringHashSet);

		Set<String> stringTreeSet = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length() - o2.length();
			}
		});
		stringTreeSet.addAll(Arrays.asList(strings));
		traverseCollection(stringTreeSet);

		Set<String> stringLinkedHashSet = new LinkedHashSet<String>(Arrays.asList(strings));
		traverseCollection(stringLinkedHashSet);
	}

	public static <T> void traverseCollection(Collection<T> collection) {
		for (Iterator<T> iterator = collection.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			System.out.print("[" + t + "] ");
		}
		System.out.println();
	}

}
