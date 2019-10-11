package com.yichen.thinking.in.java.chapter07;

class ChessWithoutDefaultConstructor extends BoardGame {
	ChessWithoutDefaultConstructor() {
		super(11);
		System.out.println("ChessWithoutDefCtor constructor");
	}
}

public class Chapter07Exercise06 {
	public static void main(String args[]) {
		new ChessWithoutDefaultConstructor();
	}
} /// :~