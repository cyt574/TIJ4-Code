package com.yichen.thinking.in.java.chapter21;

class FibonacciProducer extends Thread{
	static int counter = 0;
	final int id = counter++;
	int quantity = 0;
	public FibonacciProducer(int quantity) {
		this.quantity = quantity;
	}
	
	public int fibonacci(int n) {
		if( n < 2) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	@Override
	public void run() {
		while(quantity-- > 0) {
			System.out.println("Thread [" + id + "] producing " + fibonacci(quantity));
		}
		System.out.println("Thread [" + id + "] end!");
	}
}

public class Chapter21Exercise02 {

	public static void main(String[] args) {
		new FibonacciProducer(1).start();
		new FibonacciProducer(2).start();
		new FibonacciProducer(3).start();
		new FibonacciProducer(4).start();
		new FibonacciProducer(10).start();
	}

}
