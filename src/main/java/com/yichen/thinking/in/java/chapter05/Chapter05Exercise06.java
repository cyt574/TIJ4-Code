package com.yichen.thinking.in.java.chapter05;

class Corgi extends Dog {
	public void barking(String str, int time) {
		while(--time > 0) {
			System.out.println("Barking with sound like " + str);
		}
	}
	
	public void barking(int time, String str) {
		while(--time > 0) {
			System.out.println("Barking with sound like " + str);
		}
	}
}


public class Chapter05Exercise06 {

	public static void main(String[] args) {
		Corgi dog = new Corgi();
		dog.barking("wwww", 5);
		dog.barking(5, "sssss");
	}

}
