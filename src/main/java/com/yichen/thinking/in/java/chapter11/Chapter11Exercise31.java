package com.yichen.thinking.in.java.chapter11;

import polymorphism.shape.FirstRandomShapeGenerator;
import polymorphism.shape.Shape;

public class Chapter11Exercise31 {

	public static void main(String[] args) {
		FirstRandomShapeGenerator generator = new FirstRandomShapeGenerator(10);
		for (Shape shape : generator) {
			shape.draw();
		}
	}
}
