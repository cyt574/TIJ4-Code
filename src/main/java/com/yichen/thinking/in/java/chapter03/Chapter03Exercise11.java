package com.yichen.thinking.in.java.chapter03;

import static net.mindview.util.Print.*;

public class Chapter03Exercise11 {

	public static void main(String[] args) {
		int number = 0x80000000;
		for (int i = 0; i < 8*4; i++) {
			print(Integer.toBinaryString(number));
			number >>= 1;
		}
	}

}
