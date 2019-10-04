package com.yichen.thinking.in.java.chapter11;

import java.util.PriorityQueue;

class Doggy {
	
}

public class Chapter11Exercise29 {

	public static void main(String[] args) {
		PriorityQueue<Doggy> queue = new PriorityQueue<Doggy>();
		Doggy dog1 = new Doggy();
		Doggy dog2 = new Doggy();
		
		queue.offer(dog1);
		queue.offer(dog2);
	}

}
