package com.yichen.thinking.in.java.chapter08;

public class Chapter08Exercise05 {

	public static void ride(Cycle c) {
		c.ride();
		System.out.println(c.wheels());;
	}
	
	public static void main(String[] args) {
		ride(new Bicycle());
		ride(new Tricycle());
		ride(new Unicycle());
	}

}
