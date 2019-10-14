package com.yichen.thinking.in.java.chapter11;

import java.util.PriorityQueue;
import java.util.Random;

public class Chapter11Exercise28 {

	public static void main(String[] args) {
		Random random = new Random(47);
		PriorityQueue<Double> priorityQueue = new PriorityQueue<Double>();
		for (int i = 0; i < 10; i++) {
			priorityQueue.offer(random.nextDouble());
		}
		
		print(priorityQueue);
	}

	private static void print(PriorityQueue<Double> priorityQueue) {
		for(Double d = priorityQueue.poll(); d != null; d = priorityQueue.poll()) {
			System.out.println(d);
		}
	}

}
