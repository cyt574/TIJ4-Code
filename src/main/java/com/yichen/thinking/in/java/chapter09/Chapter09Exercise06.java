package com.yichen.thinking.in.java.chapter09;

import com.yichen.thinking.in.java.chapter09.interfaces.Interface2;

class Implement2 implements Interface2 {

	@Override
	public void print() {
		//Auto cast to public
		System.out.println("Implement2 Print()");
	}
	
}

public class Chapter09Exercise06 {

	public static void main(String[] args) {
		new Implement2().print();
	}

}
