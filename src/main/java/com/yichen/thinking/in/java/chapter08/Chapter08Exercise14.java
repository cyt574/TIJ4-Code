package com.yichen.thinking.in.java.chapter08;

import static net.mindview.util.Print.*;

class NonSharedMember {
	public NonSharedMember(String string) {
		System.out.println("NonSharedMember constructor:" + string);
	}
}

class SharedMember {
	private int refcount;
//	private static long counter = 0;
//	private final long id = counter++;

	public SharedMember() {
		print("SharedMember constructor: ");
	}

	public void addRef() {
		print("Number of references " + ++refcount);
	}

	protected void dispose() {
		if (--refcount == 0) {
			print("Disposing " + this);
		}
	}

	public String toString() {
		return "Shared member";
	}
}

class Rodent1 {
	private SharedMember m;
	NonSharedMember m1 = new NonSharedMember("r1");
	NonSharedMember m2 = new NonSharedMember("r2");

	public Rodent1(SharedMember m) {
		print("Rodent1 constructor");
		this.m = m;
		m.addRef();
	}

	public void hop() {
		print("Rodent hopping");
	}

	public void scurry() {
		print("Rodent scurrying");
	}

	public void reproduce() {
		print("Making more Rodents");
	}

	@Override
	public String toString() {
		return "Rodent1: ";
	}

	protected void dispose() {
		m.dispose();
		print("Disposing " + this);
	}

}

class Mouse1 extends Rodent1 {

	private SharedMember m;
	NonSharedMember m1 = new NonSharedMember("r1");
	NonSharedMember m2 = new NonSharedMember("r2");

	public Mouse1(SharedMember m) {
		super(m);
		this.m = m;
		print("Mouse1 constructor");
	}

	public void hop() {
		print("Mouse1 hopping");
	}

	public void scurry() {
		print("Mouse1 scurrying");
	}

	public void reproduce() {
		print("Making more Mouse1");
	}

	@Override
	public String toString() {
		return "Mouse1: ";
	}

	protected void dispose() {
		print("Disposing " + this);
		m.dispose();
	}
}

class Gerbil1 extends Rodent1 {

	NonSharedMember m1 = new NonSharedMember("r1");
	NonSharedMember m2 = new NonSharedMember("r2");

	public Gerbil1(SharedMember m) {
		super(m);
		print("Gerbil1 constructor");
	}

	public void hop() {
		print("Gerbil1 hopping");
	}

	public void scurry() {
		print("Gerbil1 scurrying");
	}

	public void reproduce() {
		print("Making more Gerbil1");
	}

	@Override
	public String toString() {
		return "Gerbil1: ";
	}

}

class Hamster1 extends Rodent1 {

	NonSharedMember m1 = new NonSharedMember("r1");
	NonSharedMember m2 = new NonSharedMember("r2");

	public Hamster1(SharedMember m) {
		super(m);
		print("Hamster1 constructor");
	}

	public void hop() {
		print("Hamster1 hopping");
	}

	public void scurry() {
		print("Hamster1 scurrying");
	}

	public void reproduce() {
		print("Making more Hamster1");
	}

	@Override
	public String toString() {
		return "Hamster1: ";
	}

}

public class Chapter08Exercise14 {

	public static void main(String[] args) {
		SharedMember sm = new SharedMember();
		Rodent1[] rodent1s = { new Mouse1(sm), new Gerbil1(sm), new Hamster1(sm) };
		for (Rodent1 rodent1 : rodent1s) {
			rodent1.dispose();
		}
	}

}
