package com.yichen.thinking.in.java.chapter11;

import java.util.ArrayList;

class Gerbil {
	String name;
	public Gerbil(String name) {
		this.name = name;
	}
	void hop() {
		System.out.println("Gerbil:" + name);
	}
}

public class Chapter11Exercise01 {

	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>(); 
		gerbils.add(new Gerbil("1"));
		gerbils.add(new Gerbil("2"));
		gerbils.add(new Gerbil("3"));
		
		for (Gerbil gerbil : gerbils) {
			gerbil.hop();
		}
	}

}
