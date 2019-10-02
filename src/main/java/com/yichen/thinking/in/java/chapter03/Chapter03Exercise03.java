package com.yichen.thinking.in.java.chapter03;

import javax.security.auth.x500.X500Principal;

import net.mindview.util.Print;

public class Chapter03Exercise03 {

	char c;
	
	static void f(Chapter03Exercise03 y) {
		y.c = 'z'; 
	}
	public static void main(String[] args) {
		Chapter03Exercise03 instance = new Chapter03Exercise03();
		instance.c = 'a';
		Print.print("1: instance.c: " + instance.c);
		f(instance);
		Print.print("1: instance.c: " + instance.c);
	}
}
