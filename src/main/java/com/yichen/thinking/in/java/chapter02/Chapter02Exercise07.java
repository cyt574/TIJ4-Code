package com.yichen.thinking.in.java.chapter02;

class StaticTest {
	static int i = 47;
}

class Incrementable {
	static void increment() {
		StaticTest.i++;
	}
}

public class Chapter02Exercise07 {

	public static void main(String[] args) {
		Incrementable.increment();
		System.out.println(StaticTest.i);
	}

}
