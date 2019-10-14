package com.yichen.thinking.in.java.chapter07;

final class FinalClassB {
	private final BlankClass blankClass;
	
	public FinalClassB() {
		this.blankClass = new BlankClass();
//		this.blankClass = new BlankClass(); can't initialize twice
	}
}

//class FinalClassC extends FinalClassB {
//	
//}  // can't extends final class;

public class Chapter07Exercise22 {
	
}
