package com.yichen.thinking.in.java.chapter07;

class SecondDetergent extends Detergent {
	@Override
	public void scrub() {
		System.out.println("scrub override");
	}
	
	public SecondDetergent sterilize() {
		System.out.println("sterilize!");
		return this;
	}
}

public class Chapter07Exercise02 {

	public static void main(String[] args) {
		new SecondDetergent().sterilize().scrub();
	}

}
