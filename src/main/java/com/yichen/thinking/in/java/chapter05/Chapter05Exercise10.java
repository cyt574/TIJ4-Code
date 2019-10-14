package com.yichen.thinking.in.java.chapter05;

class Huskie {
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize start!");
		super.finalize();
	}
}

public class Chapter05Exercise10 {
	public static void main(String[] args) {
		new Huskie();
	}
}
