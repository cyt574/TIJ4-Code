//: polymorphism/shape/Circle.java
package polymorphism.shape;

import static net.mindview.util.Print.*;

public class Circle extends Shape {
	public void draw() {
		print("Circle.draw()");
	}

	public void erase() {
		print("Circle.erase()");
	}

	public void msg() {
		System.out.println("Circle.msg()");
	}
} 
/// :~
