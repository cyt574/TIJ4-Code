package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.Countries;

public class Chapter11Exercise24 {

	public static void main(String[] args) {
		Map<String, Object> map = new LinkedHashMap<String, Object>(Countries.capitals());
		
		List<String> set = new ArrayList<String>(map.keySet());
		Map<String, Object> m = new HashMap<String, Object>(map);
		Collections.sort(set);
		
		for(String s : set) {
			map.put(s, m.get(s));
		}
		System.out.println(map);
	}

}
