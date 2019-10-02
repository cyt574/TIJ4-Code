package com.yichen.thinking.in.java.chapter02;

public class Chapter02Exercise11 {

	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int Hue) {
		anIntegerRepresentingColors = Hue;
	}
	
	public static void main(String[] args) {
		Chapter02Exercise11 chapter02Exercise11 = new Chapter02Exercise11();
		int newHue = 1;
		chapter02Exercise11.changeTheHueOfTheColor(newHue);
	}
}
