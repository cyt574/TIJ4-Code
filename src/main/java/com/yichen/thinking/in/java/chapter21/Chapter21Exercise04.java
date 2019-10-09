package com.yichen.thinking.in.java.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Chapter21Exercise04 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new FibonacciProducer(5));
		}
		executorService.shutdown();
		
		executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			executorService.execute(new FibonacciProducer(5));
		}
		executorService.shutdown();
		
		executorService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new FibonacciProducer(5));
		}
		executorService.shutdown();
	}

}
