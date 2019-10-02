package com.yichen.thinking.in.java.chapter03;

class Dog {
	String name;
	String says;
}
public class Chapter03Exercise05 {

	public static void main(String[] args) {
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		spot.name = "spot";
		spot.says = "Ruff!";
		
		scruffy.name = "scruffy";
		scruffy.says = "Wurf!";
		
		System.out.println(spot.name + " says " + spot.says);
		System.out.println(scruffy.name + " says " + scruffy.says);
	}

}
