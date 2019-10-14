package com.yichen.thinking.in.java.chapter08;

class Cycle {
	
	private int wheels;
	
	void ride() {
		System.out.println("Cycle ride()");
	}
	int wheels() {
		return wheels;
	}
}

class Unicycle extends Cycle {
	void ride() {
		System.out.println("Unicycle ride()");
	}
	
	int wheels() {
		return 1;
	}
	
	int balance() {
		return 1;
	}
}

class Bicycle extends Cycle {
	void ride() {
		System.out.println("Bicycle ride()");
	}
	
	int wheels() {
		return 2;
	}
	
	int balance() {
		return 1;
	}
}

class Tricycle extends Cycle {
	void ride() {
		System.out.println("Tricycle ride()");
	}
	
	int wheels() {
		return 3;
	}

}

public class Chapter08Exercise01 {

	public static void ride(Cycle c) {
		c.ride();
	}
	
	public static void main(String[] args) {
//		Cycle c1 = new Unicycle();
//		Cycle c2 = new Bicycle();
//		Cycle c3 = new Tricycle();
//		c1.ride();
//		c2.ride();
//		c3.ride();
		ride(new Cycle());
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());
	}

}
