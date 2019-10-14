package com.yichen.thinking.in.java.chapter08;

class Rodent {
	Hand hand = new Hand(this);
	
	public Rodent() {
		System.out.println("Rodent constructor invoke");
	}
	
	void eat() {
		System.out.println("Rodent eat!");
	}
	
	void jump() {
		System.out.println(this);
		System.out.println("Rodent jump");
	}
}

class Hand {
	public Hand(Rodent r) {
		System.out.println(r + "Hand ~");
	}
}

class Mouse extends Rodent {
	
	public Mouse() {
		System.out.println("Mouse constructor invoke");
	}
	
	@Override
	void eat() {
		System.out.println("Mouse eat!");
	}
	
}

class Gerbil extends Rodent{
	
	public Gerbil() {
		System.out.println("Gerbil constructor invoke");
	}
	
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Gerbill eat!");
	}
}

class Hamster extends Rodent {
	
	public Hamster() {
		System.out.println("Hamster constructor invoke");
	}
	
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Hamster eat!");
	}
}


public class Chapter08Exercise09 {

	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[] { new Mouse() , new Gerbil(), new Hamster()};
		
		for (int i = 0; i < rodents.length; i++) {
			rodents[i].eat();
			rodents[i].jump();
		}
	}

}
