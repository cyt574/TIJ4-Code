package com.yichen.thinking.in.java.chapter11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import net.mindview.util.TextFile;

public class Chapter11Exercise20 {
	private final static Set<Character> vowels =
			new HashSet<Character>(Arrays.asList('a', 'e', 'o', 'u',
			'i', 'A', 'E', 'O', 'U', 'I'));
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Set<String> words = new HashSet<String>(new TextFile("UniqueWords.java", "\\W+"));
		Integer totalCount = null;
		
		for (String word : words) {
			char[] charactors = word.toCharArray();
			for(int i = 0; i < charactors.length; i++) {
				Map<Character, Integer> wordMap = new HashMap<Character, Integer>();
				Integer count = null;
				if(vowels.contains(charactors[i])) {
					char c = Character.toLowerCase(charactors[i]);
					
					count = wordMap.get(c);
					wordMap.put(c, count == null ? 1: count + 1);
					
					totalCount = map.get(c);
					map.put(c, totalCount == null ? 1: totalCount + 1);
				}
			
				Iterator<Entry<Character, Integer>> entryIterator = wordMap.entrySet().iterator();
				while (entryIterator.hasNext()) {					
					Entry<Character, Integer> entry = entryIterator.next();
					System.out.println("word: [ " + word + " ] has '" + entry.getKey() + "' number:" + entry.getValue() );
				}
			}
		}
		
		System.out.println(map);
	}

}
