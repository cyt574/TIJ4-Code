package com.yichen.thinking.in.java.chapter09;

import com.yichen.thinking.in.java.chapter09.interfaces.interfaceprocessor.Apply;
import com.yichen.thinking.in.java.chapter09.interfaces.interfaceprocessor.Processor;

class Reverse {
	public static String reverseString(String s) {
		char[] charactors = s.toCharArray();
		for (int i = 0; i < charactors.length / 2; i++) {
			charactors = reverseOne(charactors, i);
		}
		return String.valueOf(charactors);
	}

	private static char[] reverseOne(char[] charactors, int i) {
		char temp = charactors[i];
		int tail = charactors.length - i - 1;
		charactors[i] = charactors[tail];
		charactors[tail] = temp;
		return charactors;
	}

}

class ReverseProcessor implements Processor {

	@Override
	public String name() {
		return "Reverse Processor";
	}

	@Override
	public Object process(Object input) {
		return Reverse.reverseString((String)input);
	}
}


public class Chapter09Exercise11 {

	public static void main(String[] args) {
		Apply.process(new ReverseProcessor(), "that's good");
		System.out.println(Reverse.reverseString("fuck you"));
	}

}
