package com.yichen.thinking.in.java.chapter21;

class Printer implements Runnable{
	private static int counter = 0;
	private final int id = counter++;

	public Printer() {
		System.out.println("Printer: " + id + " Created!");
	}
	
	@Override
	public void run() {
		System.out.println("<------------------Stage1----------------->" + id);
		Thread.yield();
		System.out.println("<------------------Stage2----------------->" + id);
		Thread.yield();
		System.out.println("<------------------Stage3----------------->" + id);
		Thread.yield();
		System.out.println("<------------------End----------------->" + id);
	}	
}

public class Chapter21Exercise01 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			new Thread(new Printer()).start();
		}

	}

}
