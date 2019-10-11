package com.yichen.thinking.in.java.chapter07;

class SelfCounter {
	private static int counter = 0;
	private final int id = counter++;
	@Override
	public String toString() {
		return "SelfCounter: " + id;
	}
}

class StaticFinal {
	final SelfCounter finalSelfCounter = new SelfCounter();
	static final SelfCounter staticFinalSelfCounter = new SelfCounter();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "staticFinalSelfCounter = " + staticFinalSelfCounter +"\nfinalSelfCounter = " + finalSelfCounter;
	}
}

public class Chapter07Exercise18 {

	public static void main(String[] args) {
		System.out.println(new StaticFinal());
		System.out.println("/////////////////////////////////////////////");
		System.out.println(new StaticFinal());
	}

}
