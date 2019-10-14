package com.yichen.thinking.in.java.chapter04;

public class Chapter04Exercise09 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println("Usage: Chapter04Exercise09 number");
		}
		for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
			System.out.println(fibonacci(i));
		}
	}
	
	static int fibonacci(int i) {
		if(i == 1 || i == 2) {
			return 1;
		};	
		return fibonacci(i - 1) + fibonacci(i - 2); 
	}

}
