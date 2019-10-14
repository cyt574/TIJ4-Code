package com.yichen.thinking.in.java.chapter05;

class Dog {
	public void barking() {
		System.out.println("Barking!!!");
	}
	
	public void howling() {
		System.out.println("Howling!!!");
	}

	public void barking(String string) {
		System.out.println("Barking with sound like " + string);
	}

	public void howling(String string) {
		System.out.println("Howling with sound like " + string);
	}
}

public class Chapter05Exercise05 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.barking();
		dog.barking("wwwwwwww");
		dog.howling();
		dog.howling("WWWWWWWW");
	}

}
