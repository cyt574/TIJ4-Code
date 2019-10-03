package com.yichen.thinking.in.java.chapter05;

public class Chapter05Exercise08 {
	public void methodA() {
		System.out.println("MethodA invoded");
	}
	
	public void methodB() {
		methodA();
		this.methodA();
	}
	
	public static void main(String[] args) {
		Chapter05Exercise08 instance = new Chapter05Exercise08();
		instance.methodB();
	}
}
