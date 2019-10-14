package com.yichen.thinking.in.java.chapter07;

class A {
	public A() {
		System.out.println("A constructor");
	}
}

class B {
	public B() {
		System.out.println("B constructor");
	}
}

class C extends A {
	B b = new B();
}

public class Chapter07Exercise05 {

	public static void main(String[] args) {
		new C();
	}

}
