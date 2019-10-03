package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static net.mindview.util.Print.*;

public class Chapter11Exercise06 {

	public static void main(String[] args) {
		Random rand = new Random(47);
		
		List<String> stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "E", "F", "G", "H", "I"));
		print("1: " + stringList);
		
		String s1 = "J";
		stringList.add(s1);
		print("2: " + stringList);
		print("3: " + stringList.contains(s1));
		stringList.remove(s1);
		
		String s2 = stringList.get(2);
		print("4: " + s2 + " " + stringList.indexOf(s2));
		
		String s3 = "F";
		print("5: " + stringList.indexOf(s3));
		print("6: " + stringList.remove(s3));
		
		print("7: " + stringList.remove(s2));
		print("8: " + stringList);
		
		stringList.add(3, "K");
		print("9: " + stringList);
		
		List<String> sub = stringList.subList(1, 4);
		print("subList: " + sub);
		print("10: " + stringList.containsAll(sub));
		
		Collections.sort(sub);
		print("sorted List: " + sub);
		print("11: " + stringList.containsAll(sub));
		
		Collections.shuffle(sub, rand);
		print("shuffled subList: " + sub);
		print("12: " + stringList.containsAll(sub));
		
		List<String> copy = new ArrayList<String>(stringList);
		sub = Arrays.asList(stringList.get(1), stringList.get(4));
		print("sub: " + sub);
		
		copy.retainAll(sub);
		print("13: " + copy);
		
		copy = new ArrayList<String>(stringList);
		copy.remove(2);
		print("14: " + copy);
		
		copy.removeAll(sub);
		print("15: " + copy);
		
		copy.set(1, "L");
		print("16: " + copy);
		
		copy.addAll(2, sub);
		print("17: " + copy);
		
		print("18: " + stringList.isEmpty());
		stringList.clear();
		print("19: " + stringList);
		print("20: " + stringList.isEmpty());
		
		stringList.addAll(Arrays.asList("M", "N", "O", "P", "Q"));
		print("21: " + stringList);
		
		Object[] o = stringList.toArray();
		print("22: " + o[3]);
		
		String[] strings = stringList.toArray(new String[0]);
		print("23: " + strings[3]);
	}

}
