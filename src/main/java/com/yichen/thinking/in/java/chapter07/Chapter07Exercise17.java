package com.yichen.thinking.in.java.chapter07;

class CrazyFrog extends Amphibian{
	@Override
	void jump() {
		System.out.println("Big jump!");
	}
}

public class Chapter07Exercise17 {

	public static void main(String[] args) {
		Amphibian a = new CrazyFrog();
		a.jump();
	}

}
