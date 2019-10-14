package com.yichen.thinking.in.java.chapter07;
import static net.mindview.util.Print.*;

class JapaneseBeetle extends Beetle {
	int m = printInit("JapaneseBeetle.m initialized");
	JapaneseBeetle() {
		print("m = " + m);
		print("j = " + j);
	}
	static int x3 = printInit("static JapaneseBeetle.x3 initialized");
}
public class Chapter07Exercise24 {
	public static void main(String args[]) {
		new JapaneseBeetle();
	}
} 