package com.yichen.thinking.in.java.chapter03;

import static net.mindview.util.Print.print;

public class Chapter03Exercise14 {

	public static void main(String[] args) {
		print(compare("Hello", "Hello"));
		// Force creation of separate object:
		String s = new String("Hello");
		print(compare("Hello", s));
		print(compare("Hello", "Goodbye"));
	}
	
	public static boolean compare(String s1, String s2) {
		if(s1 == null) {
			return false;
		}
		
		if(s1 == s2) {
			return true;
		}
		
		if(s1.equals(s2)) {
			return true;
		}
		return false;
	}
	
}
