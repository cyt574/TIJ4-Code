package com.yichen.thinking.in.java.chapter07;

class ClassWithPrivate {
	private void doSomething() {
		System.out.println("Do something private");
	}
}

class ExtendedClass extends ClassWithPrivate {
//	@Override
	public void doSomething() {
		System.out.println("Do something public");
	}
}

public class Chapter07Exercise20 {

	public static void main(String[] args) {
		ExtendedClass extendedClass = new ExtendedClass();
		extendedClass.doSomething();
	}

}