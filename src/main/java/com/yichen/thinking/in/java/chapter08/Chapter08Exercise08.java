package com.yichen.thinking.in.java.chapter08;

import java.util.Random;

class InstrumentGenerator {
	Random gen = new Random(47);

	public Instrument next() {
		switch (gen.nextInt(7)) {
		default:
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Stringed();
		case 3:
			return new Brass();
		case 4:
			return new Woodwind();
		case 5:
			return new Electronic();
		}
	}
}

public class Chapter08Exercise08 {

	static InstrumentGenerator instrumentGenerator = new InstrumentGenerator();
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(instrumentGenerator.next());
		}
	}

}
