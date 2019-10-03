package com.yichen.thinking.in.java.chapter05;

public class Chapter05Exercise02 {
	String s1 = "Initialized at definition";
	String s2;
	public Chapter05Exercise02(String s2i) {
	s2 = s2i;
	}
	public static void main(String args[]) {
		Chapter05Exercise02 si =
	new Chapter05Exercise02(
	"Initialized at construction");
	System.out.println("si.s1 = " + si.s1);
	System.out.println("si.s2 = " + si.s2);
	}
}
