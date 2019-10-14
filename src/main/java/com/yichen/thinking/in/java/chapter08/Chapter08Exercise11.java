package com.yichen.thinking.in.java.chapter08;

import static net.mindview.util.Print.*;

class Pickle {
	public Pickle() {
		System.out.println("Pickle()");
	}
}

class Sandwich2 extends PortableLunch {
	Bread b = new Bread();
	Cheese c = new Cheese();
	Lettuce l = new Lettuce();
	Pickle p = new Pickle();

	Sandwich2() {
		print("Sandwich()");
	}
}

public class Chapter08Exercise11 {

	public static void main(String[] args) {
		new Sandwich2();
	}

}
