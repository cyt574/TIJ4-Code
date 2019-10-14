package com.yichen.thinking.in.java.chapter08;

public class Chapter08Exercise17 {

	public static void main(String[] args) {
		Cycle[] cycles = new Cycle[] {new Unicycle(), new Bicycle(), new Tricycle()};
//			cycle.balance();
		((Unicycle)cycles[0]).balance();
		((Bicycle)cycles[1]).balance();
		((Unicycle)cycles[2]).balance();
	}

}
