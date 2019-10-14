package com.yichen.thinking.in.java.chapter03;

import static net.mindview.util.Print.print;

public class Chapter03Exercise13 {

	public static void main(String[] args) {
		char a = 'a';
		char b = 'b';
		char c = 'c';
		showBinary(a);
		showBinary(b);
		showBinary(c);
	}

	public static void showBinary(char c) {
		print(Integer.toBinaryString(c));
		print(Integer.toHexString(c));
	}
}
