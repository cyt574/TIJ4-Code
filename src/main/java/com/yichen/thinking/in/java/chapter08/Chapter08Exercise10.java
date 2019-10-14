package com.yichen.thinking.in.java.chapter08;

class Base {
    void firstMethod() {
		secondMethod();
	}
    
    void secondMethod() {
    	
    }
}

class Method extends Base {
	@Override
	void secondMethod() {
		System.out.println("secondMethod()");
	}
}

public class Chapter08Exercise10 {
	public static void main(String[] args) {
		Base b = new Method();
		b.firstMethod();
	}

}
