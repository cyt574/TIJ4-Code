package com.yichen.thinking.in.java.chapter07;

class Component1b {
	public Component1b(int i) {
		System.out.println("Component:" + i);
	}
	
	public void dispose() {
		System.out.println("Component1b dispose");
	}
}

class Component2b {
	public Component2b(int i) {
		System.out.println("Component:" + i);
	}
	
	public void dispose() {
		System.out.println("Component2b dispose");
	}
}

class Component3b {
	public Component3b(int i) {
		System.out.println("Component:" + i);
	}
	
	public void dispose() {
		System.out.println("Component3b dispose");
	}
}

class Rootb {
	Component1b component1 = new Component1b(1);
	Component2b component2 = new Component2b(2);
	Component3b component3 = new Component3b(3);
	
	public Rootb() {
		System.out.println("Root()");

	}
	
	public void dispose() {
		System.out.println("Rootb dispose");
		component1.dispose();
		component2.dispose();
		component3.dispose();
	}
}

class Stemb extends Rootb {
	Component1b component1 = new Component1b(1);
	Component2b component2 = new Component2b(2);
	Component3b component3 = new Component3b(3);
	public Stemb() {
		System.out.println("Stem()");
	}
	
	public void dispose() {
		System.out.println("Rootb dispose");
		component1.dispose();
		component2.dispose();
		component3.dispose();
	}
}

public class Chapter07Exercise12 {

	public static void main(String[] args) {
		new Stemb().dispose();
	}

}
