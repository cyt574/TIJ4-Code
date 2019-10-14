package com.yichen.thinking.in.java.chapter11;

import java.util.Stack;

public class Chapter11Exercise15 {

	public static void main(String[] args) {
		evaluate("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
	}

	private static void evaluate(String string) {
		char data[] = string.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < data.length; ) {
			switch (data[i++]) {
			case '+':
				stack.add(data[i++]);
				break;
			case '-':
				System.out.print(stack.pop());
				break;
			default:
				break;
			}
		}
	}

}
