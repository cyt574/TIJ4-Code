package com.yichen.thinking.in.java.chapter08;

import static net.mindview.util.Print.print;

class RectangularGlyph extends Glyph {
	private int width = 4;
	private int height = 5;

	public RectangularGlyph(int width, int height) {
		this.width = width;
		this.height = height;
		print("RectangularGlyph.RectangularGlyph(), width = " + width + ", height = " + height);
	}

	@Override
	void draw() {
		print("RectangularGlyph.draw(), area = " + width * height);
	}
}

public class Chapter08Exercise15 {

	public static void main(String[] args) {
		new RoundGlyph(5);
		new RectangularGlyph(5, 4);
//		During construction, you see output of 
//		area = 0 because the base-class constructor calls draw( ), though this isn’t
//	    obvious in the code.
	}

}
