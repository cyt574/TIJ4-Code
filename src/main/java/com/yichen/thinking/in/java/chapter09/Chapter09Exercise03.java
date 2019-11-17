package com.yichen.thinking.in.java.chapter09;

abstract class Base {
	
	public Base() {
		print();
	}
	
	abstract void print();
}

class First extends Base {

	int variable = 123;
	
	@Override
	void print() {
		System.out.println(variable);
	}
	
}

public class Chapter09Exercise03 {

	public static void main(String[] args) {
		new First().print();
	}

}
