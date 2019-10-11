package com.yichen.thinking.in.java.chapter07;

class Clazz {
	char test(char c) {
		return c;
	}
	String test(String str) {
		return str;
	}
	int test(int i) {
		return i;
	}
}

class EClazz extends Clazz {
	long test(long l) {
		return l;
	}
}

public class Chapter07Exercise13 {

	public static void main(String[] args) {
		EClazz e = new EClazz();
		System.out.println(e.test('c'));
		System.out.println(e.test("test"));
		System.out.println(e.test(1));
		System.out.println(e.test(1L));
	}

}
