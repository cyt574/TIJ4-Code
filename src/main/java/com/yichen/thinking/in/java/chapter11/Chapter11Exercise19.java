package com.yichen.thinking.in.java.chapter11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import net.mindview.util.Countries;

public class Chapter11Exercise19 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>(Countries.names());
		System.out.println(s1);
		
		String[] set = s1.toArray(new String[0]);
		Arrays.sort(set);
		
		Set<String> s2 = new LinkedHashSet<String>();
		for (String string : set) {
			s2.add(string);
		}
		
		System.out.println(s2);
		
	}

}
