package com.yichen.thinking.in.java.chapter03;

import net.mindview.util.Print;

public class Chapter03Exercise02 {

	float a;

	public static void main(String[] args) {
		Chapter03Exercise02 instance01 = new Chapter03Exercise02();
		instance01.a = 1.0f;
		Print.print("instance01.a = " + instance01.a);
		Chapter03Exercise02 instance02 = instance01;
		instance02.a = 2.0f;
		Print.print("instance01.a = " + instance01.a);
	}

}
