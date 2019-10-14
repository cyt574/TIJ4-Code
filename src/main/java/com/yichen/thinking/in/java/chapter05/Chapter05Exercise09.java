package com.yichen.thinking.in.java.chapter05;

public class Chapter05Exercise09 {

	public Chapter05Exercise09() {
		
	}
	
	public Chapter05Exercise09(String str) {
		System.out.println(str);
	}
	
	public Chapter05Exercise09(String str, int count) {
		this(str);
	}
	
	public static void main(String[] args) {
		Chapter05Exercise09 instance = new Chapter05Exercise09("test", 5);
	}

}
