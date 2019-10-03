package com.yichen.thinking.in.java.chapter05;

public class Chapter05Exercise11 {

	public static void main(String[] args) {
		new Huskie();
		System.gc();
		System.runFinalization();
	}

}
