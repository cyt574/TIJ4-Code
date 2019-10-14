package com.yichen.thinking.in.java.chapter07;


class A1 {
	public A1(int i) {
		System.out.println("A constructor");
	}
}

class B1 {
	public B1(int i) {
		System.out.println("B constructor");
	}
}

class C1 extends A1 {
	public C1(int i) {
		super(i);
	}

	B1 b = new B1(1);
}

public class Chapter07Exercise07 {

	public static void main(String[] args) {
		new C1(1);
	}

}
