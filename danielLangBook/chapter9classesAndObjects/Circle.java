package chapter9classesAndObjects;

public class Circle {
	double radius = 1;

	// construct a circle object
	Circle() {
	}

	Circle(double newRadius) {
		radius = newRadius;
	}

	double getArea() {
		return Math.PI * radius * radius;
	}

	double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
