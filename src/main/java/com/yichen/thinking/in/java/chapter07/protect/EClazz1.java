package com.yichen.thinking.in.java.chapter07.protect;

class Clazz1 {
	protected void doSomething() {
		System.out.println("Do something!");
	}
}
public class EClazz1 extends Clazz1 {
	public void dispose() {
		doSomething();
	}
}