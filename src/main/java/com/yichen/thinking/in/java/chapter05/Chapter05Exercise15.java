package com.yichen.thinking.in.java.chapter05;

class Mug {
	public Mug(int marker) {
		System.out.println("Mug(" + marker + ")");
	}
	
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Mugs {
	Mug mug0 = new Mug(0);
	Mug mug1;
	Mug mug2;
	
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug2 initialize");
	}
}
public class Chapter05Exercise15 {

	public static void main(String[] args) {
		System.out.println("inside main method");
		new Mugs();
		new Mugs();
	}

}
