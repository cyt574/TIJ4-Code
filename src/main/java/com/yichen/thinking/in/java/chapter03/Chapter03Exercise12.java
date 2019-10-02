package com.yichen.thinking.in.java.chapter03;

import static net.mindview.util.Print.print;

public class Chapter03Exercise12 {

	public static void main(String[] args) {
		int number = 0xffffffff;
		print(Integer.toBinaryString(number));
		number <<= 1;
		for (int i = 0; i < 8 * 4; i++) {
//			print(Integer.toBinaryString(number));
//			number <<= 1;
			print(Integer.toBinaryString(number));
			number >>>= 1;
		}
	}

}
