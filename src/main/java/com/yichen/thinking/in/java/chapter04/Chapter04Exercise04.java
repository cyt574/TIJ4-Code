package com.yichen.thinking.in.java.chapter04;

public class Chapter04Exercise04 {

	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if( number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
