package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.mindview.util.TextFile;

public class Chapter11Exercise25 {

	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		TextFile textFile = new TextFile("UniqueWords.java", "\\W+");
		Iterator<String> it = textFile.iterator();
	    int wordCount = 0;
		while (it.hasNext()) {
			String s = it.next();
			wordCount++;
			if(map.containsKey(s)) {
				map.get(s).add(wordCount);
			} else {
				ArrayList<Integer> arrayList = new ArrayList<Integer>();
				arrayList.add(wordCount);
				map.put(s, arrayList);
			}
		}
		System.out.println(map);
	}

}
