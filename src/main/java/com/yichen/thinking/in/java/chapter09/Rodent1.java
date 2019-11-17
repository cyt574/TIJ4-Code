package com.yichen.thinking.in.java.chapter09;


public interface Rodent1 {
	void eat();
}

class Mouse1 implements Rodent1 {

	public Mouse1() {
		System.out.println("Mouse constructor invoke");
	}

	@Override
	public void eat() {
		System.out.println("Mouse eat!");
	}

}

class Gerbil1 implements Rodent1 {

	public Gerbil1() {
		System.out.println("Gerbil constructor invoke");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Gerbill eat!");
	}
}

class Hamster1 implements Rodent1 {

	public Hamster1() {
		System.out.println("Hamster constructor invoke");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Hamster eat!");
	}
}
