package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.mindview.util.TextFile;

public class Chapter11Exercise21 {

	public static void main(String[] args) {
		TextFile textFile = new TextFile("UniqueWords.java", "\\W+");
	    Map<String,Integer> map = new HashMap<String, Integer>();
	    
	    for (Iterator<String> iterator = textFile.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			Integer count = map.get(string);
			map.put(string, count==null? 1:count+1);
		}
	    
	    List<String> keySet = new ArrayList<String>(map.keySet());
	    Collections.sort(keySet, String.CASE_INSENSITIVE_ORDER);
	    
	    for(String entry: keySet) {
	    	System.out.print(entry + "=" + map.get(entry) + " ");
	    }
	}

}
