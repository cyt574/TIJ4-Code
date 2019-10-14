package com.yichen.thinking.in.java.chapter21;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FirstFibonacciProducer implements Callable<Integer>{
	static int counter = 0;
	final int id = counter++;
	int quantity = 0;
	public FirstFibonacciProducer(int quantity) {
		this.quantity = quantity;
	}
	
	public int fibonacci(int n) {
		if( n < 2) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	@Override
	public Integer call() throws Exception {
		int result = 0;
		for (; quantity >= 0; quantity--) {
			result += fibonacci(quantity);
		}
		return result;
	}
}

public class Chapter21Exercise05 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		ArrayList<Future<Integer>> arrayList = new ArrayList<Future<Integer>>();
		for (int i = 1; i < 10; i++) {
			arrayList.add(executorService.submit(new FirstFibonacciProducer(i)));
		}
		for (Future<Integer> future : arrayList) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				executorService.shutdown();
			}
		}
	}

}
