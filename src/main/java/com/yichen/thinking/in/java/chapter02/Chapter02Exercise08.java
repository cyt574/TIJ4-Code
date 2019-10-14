package com.yichen.thinking.in.java.chapter02;

public class Chapter02Exercise08 {
	static int staticInt = 0;
	static char staticChar = 'a';
	public static void main(String[] args) {
		Chapter02Exercise08 instance1 = new Chapter02Exercise08();
		Chapter02Exercise08 instance2 = new Chapter02Exercise08();
		System.out.println("instance1.staticInt = " + instance1.staticInt);
		System.out.println("instance1.staticChar = " + instance1.staticChar);
		System.out.println("instance2.staticInt = " + instance2.staticInt);
		System.out.println("instance2.staticChar = " + instance2.staticChar);
		
		instance1.staticInt = 1;
		instance1.staticChar = 'b';		
		
		System.out.println("instance1.staticInt = " + instance1.staticInt);
		System.out.println("instance1.staticChar = " + instance1.staticChar);
		System.out.println("instance2.staticInt = " + instance2.staticInt);
		System.out.println("instance2.staticChar = " + instance2.staticChar);
		
	}

}
