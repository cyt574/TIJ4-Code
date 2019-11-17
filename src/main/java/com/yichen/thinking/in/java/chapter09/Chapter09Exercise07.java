package com.yichen.thinking.in.java.chapter09;

public class Chapter09Exercise07 {

	public static void main(String[] args) {
		Rodent1[] rodents = new Rodent1[] { new Mouse1() , new Gerbil1(), new Hamster1()};

		for (int i = 0; i < rodents.length; i++) {
			rodents[i].eat();
//			rodents[i].jump();
		}
	}

}
