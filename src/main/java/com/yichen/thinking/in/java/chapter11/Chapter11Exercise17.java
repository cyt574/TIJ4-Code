package com.yichen.thinking.in.java.chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Chapter11Exercise17 {

	public static void main(String[] args) {
		Map<String, Gerbil> map = new HashMap<>();
		String[] names = {"one", "two", "three", "four"};
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], new Gerbil(names[i]));
		}
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key: " + key);
		    Gerbil g = map.get(key);
		    g.hop();
		}
	}

}
