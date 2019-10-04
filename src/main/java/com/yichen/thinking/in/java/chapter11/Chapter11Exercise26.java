package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import net.mindview.util.TextFile;

public class Chapter11Exercise26 {

	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		TextFile textFile = new TextFile("UniqueWords.java", "\\W+");
		Iterator<String> it = textFile.iterator();
	    int wordCount = 0;
		while (it.hasNext()) {
			String s = it.next();
			if(map.containsKey(s)) {
				map.get(s).add(wordCount);
			} else {
				ArrayList<Integer> arrayList = new ArrayList<Integer>();
				arrayList.add(wordCount);
				map.put(s, arrayList);
			}
			wordCount++;
		}
		System.out.println(map);
		
//		//ArrayList
//		ArrayList<String> text = new ArrayList<String>(textFile);
//		Iterator<Entry<String, ArrayList<Integer>>>  iterator = map.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Map.Entry<String, ArrayList<Integer>> entry =  iterator.next();
//			for (Integer integer : entry.getValue()) {
//				text.set(integer, entry.getKey());
//			}		
//		}
		
		//TreeSet
		TreeMap<Integer, String> text = new TreeMap<Integer, String>();
		Iterator<Entry<String, ArrayList<Integer>>>  iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, ArrayList<Integer>> entry =  iterator.next();
			for (Integer integer : entry.getValue()) {
				text.put(integer, entry.getKey());
			}		
		}
		
		
		System.out.println(text);
	}

}
