package com.yichen.thinking.in.java.chapter05;

class Tank {
	static int counter;
	int id = counter++;
	boolean full;
	public Tank() {
		System.out.println("Tank " + id + " created");
		full = true;
	}
	
	public void empty() {
		full = false;
	}
	
	@Override
	protected void finalize() throws Throwable {
		if(full) {
			System.err.println("Error: tank " + id + "must be empty at cleanup");
		} else {
			System.out.println(toString() + " clean up");
		}
		super.finalize();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tank " + id;
	}
}

public class Chapter05Exercise12 {

	public static void main(String[] args) {
		new Tank().empty();
		new Tank();
		// Don't empty the second one
		System.gc(); // Force finalization?
		System.runFinalization();
	}

}
