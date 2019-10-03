package com.yichen.thinking.in.java.chapter11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import net.mindview.util.Countries;

public class Chapter11Exercise18 {

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>(Countries.capitals());
		System.out.println(m1);
		String[] keySet = m1.keySet().toArray(new String[0]);
		Arrays.sort(keySet);
//		for (String string : keySet) {
//			System.out.print(string + ":");
//			System.out.println(m1.get(string));
//		}

		Map<String, String> m2 = new LinkedHashMap<String, String>();
		for (String key : keySet)
			m2.put(key, m1.get(key));
		System.out.println(m2);

	}

}
