package com.yichen.thinking.in.java.chapter03;

public class Chapter03Exercise04 {

	public static void main(String[] args) {
		if(args.length < 2) {
			System.err.println("Usage: Chapter03Exercise04 distance time");
			System.exit(1);
		}
		float distance = Float.parseFloat(args[0]);
		float time = Float.parseFloat(args[1]);
		
		System.out.println("The speed is " + distance/time);
	}
}
