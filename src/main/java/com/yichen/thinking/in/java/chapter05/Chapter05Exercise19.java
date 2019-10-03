package com.yichen.thinking.in.java.chapter05;

public class Chapter05Exercise19 {
	static void f(String... args) {
		for (String string : args) {
			System.out.println(string);
		}

	}
	public static void main(String[] args) {
		f(new String[] {"one", "two", "three"});
		f("four", "five", "six");
	}

}
