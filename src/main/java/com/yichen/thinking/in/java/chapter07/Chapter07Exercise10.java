package com.yichen.thinking.in.java.chapter07;

class Component1a {
	public Component1a(int i) {
		System.out.println("Component:" + i);
	}
}

class Component2a {
	public Component2a(int i) {
		System.out.println("Component:" + i);
	}
}

class Component3a {
	public Component3a(int i) {
		System.out.println("Component:" + i);
	}
}

class Roota {
	Component1a component1 = new Component1a(1);
	Component2a component2 = new Component2a(2);
	Component3a component3 = new Component3a(3);
	
	public Roota(int i) {
		System.out.println("Root() param:" + i);
	}
}

class Stema extends Roota {
	Component1 component1 = new Component1(1);
	Component2 component2 = new Component2(2);
	Component3 component3 = new Component3(3);
	public Stema(int i) {
		super(i);
		System.out.println("Stem() param:" + i);
	}
}

public class Chapter07Exercise10 {

	public static void main(String[] args) {
		new Stema(1);
	}

}
