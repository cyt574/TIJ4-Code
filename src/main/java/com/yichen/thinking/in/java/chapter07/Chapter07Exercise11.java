package com.yichen.thinking.in.java.chapter07;

import static net.mindview.util.Print.print;

class DetergentDelegation {
	Detergent detergent = new Detergent();
	
	// Change a method:
	public void scrub() {
		detergent.scrub();
	}

	// Add methods to the interface:
	public void foam() {
		detergent.foam();
	}
	
	public void dilute() {
		detergent.dilute();
	}

	public void apply() {
		detergent.apply();
	}
	
	@Override
	public String toString() {
		return detergent.toString();
	}
}

public class Chapter07Exercise11 {

	public static void main(String[] args) {
		DetergentDelegation x = new DetergentDelegation();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}

}
