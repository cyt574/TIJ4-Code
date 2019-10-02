package com.yichen.thinking.in.java.chapter03;

import static net.mindview.util.Print.*;

public class Chapter03Exercise10 {

	public static void main(String[] args) {
		int i1 = 0xaaaaaaaa;
		int i2 = 0x55555555;
		print("i1 = " + Integer.toBinaryString(i1));
		print("i2 = " + Integer.toBinaryString(i2));
		print("~i1 = " + Integer.toBinaryString(~i1));
		print("~i2 = " + Integer.toBinaryString(~i2));
		print("i1 & i1 = " + Integer.toBinaryString(i1 & i1));
		print("i1 | i1 = " + Integer.toBinaryString(i1 | i1));
		print("i1 ^ i1 = " + Integer.toBinaryString(i1 ^ i1));
		print("i1 & i2 = " + Integer.toBinaryString(i1 & i2));
		print("i1 | i2 = " + Integer.toBinaryString(i1 | i2));
		print("i1 ^ i2 = " + Integer.toBinaryString(i1 ^ i2));
	}

}
