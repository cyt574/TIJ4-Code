package com.yichen.thinking.in.java.chapter05;

class Cup {
	public Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}
	
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup0;
	static {
		cup0 = new Cup(0);
	}
	static Cup cup1 = new Cup(1);
	static Cup cup2;
	static {
		cup2 = new Cup(2);
	}
}

public class Chapter05Exercise14 {

	public static void main(String[] args) {
		System.out.println("inside main method");
		new Cups();
		new Cups();
	}

}
