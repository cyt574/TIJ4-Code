package com.yichen.thinking.in.java.chapter07;

class Amphibian {
	void jump() {
		System.out.println("Jump!");
	}
}

class Frog extends Amphibian{
	
}

public class Chapter07Exercise16 {

	public static void main(String[] args) {
		Amphibian a = new Frog();
		a.jump();
	}

}
