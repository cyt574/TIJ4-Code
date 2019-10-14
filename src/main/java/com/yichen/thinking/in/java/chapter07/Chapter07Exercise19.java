package com.yichen.thinking.in.java.chapter07;

class BlankClass {
}

class FinalClassA {
	private final BlankClass blankClass;
	
	public FinalClassA() {
		this.blankClass = new BlankClass();
//		this.blankClass = new BlankClass(); can't initialize twice
	}
}

public class Chapter07Exercise19 {

	public static void main(String[] args) {

	}

}
