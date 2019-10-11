package com.yichen.thinking.in.java.chapter07;

class Component1 {
	public Component1(int i) {
		System.out.println("Component:" + i);
	}
}

class Component2 {
	public Component2(int i) {
		System.out.println("Component:" + i);
	}
}

class Component3 {
	public Component3(int i) {
		System.out.println("Component:" + i);
	}
}

class Root {
	Component1 component1 = new Component1(1);
	Component2 component2 = new Component2(2);
	Component3 component3 = new Component3(3);
	
	public Root() {
		System.out.println("Root()");
	}
}

class Stem extends Root {
	Component1 component1 = new Component1(1);
	Component2 component2 = new Component2(2);
	Component3 component3 = new Component3(3);
	public Stem() {
		System.out.println("Stem()");
	}
}

public class Chapter07Exercise09 {

	public static void main(String[] args) {
		new Stem();
	}

}
