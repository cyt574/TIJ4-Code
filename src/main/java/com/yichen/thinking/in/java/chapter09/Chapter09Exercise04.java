package com.yichen.thinking.in.java.chapter09;

abstract class NoMethodAbstractClass {
	
}

class Second extends NoMethodAbstractClass {
	void print() {
		System.out.println("Second Print()");
	}
}

abstract class WithMethodAbstractClass {
	abstract void print();
}

class Third extends WithMethodAbstractClass {

	@Override
	void print() {
		System.out.println("Third Print()");
	}
	
}

public class Chapter09Exercise04 {

	public static void main(String[] args) {
		NoMethodAbstractClass noMethodAbstractClass = new Second();
		test1(noMethodAbstractClass);
		WithMethodAbstractClass withMethodAbstractClass = new Third();
		test2(withMethodAbstractClass);
	}

	private static void test2(WithMethodAbstractClass withMethodAbstractClass) {
		withMethodAbstractClass.print();
	}

	private static void test1(NoMethodAbstractClass noMethodAbstractClass) {
		((Second)noMethodAbstractClass).print();
	}

}
