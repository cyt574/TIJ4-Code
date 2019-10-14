package com.yichen.thinking.in.java.chapter06;

class Mouse {
	protected String name;
	
	Mouse(String name) {
		this.name = name;
	}
	
	protected void click() {
		System.out.println(name + " clicked!");
	}
}

public class Chapter06Exercise06 {

	public static void main(String[] args) {
		new Mouse("Lazer").click();
	}

}
