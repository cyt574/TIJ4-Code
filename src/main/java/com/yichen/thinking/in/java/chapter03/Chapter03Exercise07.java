package com.yichen.thinking.in.java.chapter03;

import java.util.Random;

public class Chapter03Exercise07 {

	public static void main(String[] args) {
		Random random = new Random();
		boolean flip = random.nextBoolean();
		System.out.println("output:");
		System.out.println(flip ? "HEAD": "TAIL");
	}

}
