//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.shape;

import java.util.*;

public class FirstRandomShapeGenerator implements Iterable<Shape> {
	private Random rand = new Random(47);
	
	private final int quantity;
	
	public FirstRandomShapeGenerator(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public Iterator<Shape> iterator() {
		return new Iterator<Shape>() {
			int index = 0;
			@Override
			public Shape next() {
				index++;
				return nextShape();
			}

			@Override
			public boolean hasNext() {
				return index < quantity ? true : false;
			}
		};
	}
	
	private Shape nextShape() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		}
	}
} /// :~
