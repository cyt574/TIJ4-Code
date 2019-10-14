package com.yichen.thinking.in.java.chapter05;

class Bully {
	String name;
	public Bully(String string) {
		System.out.println("Bully(" + string + ")");
		name = string;
	}
	
	@Override
	public String toString() {
		return "bully:" + name;
	}
}

public class Chapter05Exercise17 {

	public static void main(String[] args) {
		Bully[] bullies;
		bullies = new Bully[] {new Bully("one"), new Bully("two")};
		
		System.out.println("bullies = " + bullies[0]);
		System.out.println("..............");

		Bully[] bullies1 = new Bully[2];
		System.out.println("..............");

		
		Bully[] bullies2 = new Bully[2];
		bullies2[0] = new Bully("three");
		bullies2[1] = new Bully("four");
		
		System.out.println("bullies2 = " + bullies2[0] );
	}

}
