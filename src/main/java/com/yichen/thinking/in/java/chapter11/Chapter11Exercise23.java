package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

class Counter {
	int i = 1;

	@Override
	public String toString() {
		return Integer.toString(i);
	}
}

class IntegerCounter implements Comparable<IntegerCounter> {
	Counter counter;
	Integer integer;

	public IntegerCounter(Counter counter, Integer integer) {
		super();
		this.counter = counter;
		this.integer = integer;
	}

	@Override
	public int compareTo(IntegerCounter o) {
		return o.counter.i - this.counter.i;
	}

	@Override
	public String toString() {
		return "Int:" + integer + " Count:" + counter + "\n";
	}
}

public class Chapter11Exercise23 {

	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer, Counter> m = new HashMap<Integer, Counter>();
		for (int i = 0; i < 1000000; i++) {
			// Produce a number between 0 and 20:
			int r = rand.nextInt(10);
			if (m.containsKey(r)) {
				Counter c = m.get(r);
				c.i++;
			} else {
				m.put(r, new Counter());
			}
		}

		List<IntegerCounter> list = new ArrayList<IntegerCounter>();

//		//KeySet
//		Iterator<Integer> it = m.keySet().iterator();
//		while (it.hasNext()) {
//			Integer i = it.next();
//			list.add(new IntegerCounter(m.get(i), i));
//		}
		Iterator<Map.Entry<Integer, Counter>> it = m.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, Counter> entry = it.next();
			IntegerCounter integerCounter = new IntegerCounter(entry.getValue(), entry.getKey());
			list.add(integerCounter);
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
