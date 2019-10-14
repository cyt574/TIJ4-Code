package com.yichen.thinking.in.java.chapter04;

import static net.mindview.util.Print.*;

public class Chapter04Exercise05 {

	public static void main(String[] args) {
		int i1 = 0xaaaaaaaa;
		int i2 = 0x55555555;

		printnb("i1 = ");
		toBinaryString(i1);
		printnb("i2 = ");
		toBinaryString(i2);
		printnb("~i1 = ");
		toBinaryString(~i1);
		printnb("~i2 = ");
		toBinaryString(~i2);
		printnb("i1 & i1 = ");
		toBinaryString(i1 & i1);
		printnb("i1 | i1 = ");
		toBinaryString(i1 | i1);
		printnb("i1 ^ i1 = ");
		toBinaryString(i1 ^ i1);
		printnb("i1 & i2 = ");
		toBinaryString(i1 & i2);
		printnb("i1 | i2 = ");
		toBinaryString(i1 | i2);
		printnb("i1 ^ i2 = ");
		toBinaryString(i1 ^ i2);
	}

	private static void toBinaryString(int i) {
		char[] buffer = new char[32];
		int bufferposition = 32;
		do {
			buffer[--bufferposition] =  (i & (0x01)) == 1 ? '1' : '0';
			i >>>= 1;
		} while (i != 0);
		
//		System.out.println(buffer);
		for (int j = bufferposition; j < 32; j++) {
			printnb(buffer[bufferposition]);
		}
		print();
	}

}
