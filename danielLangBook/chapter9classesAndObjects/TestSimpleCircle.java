/**
 * 
 */
package chapter9classesAndObjects;

/**
 * @author ayush
 *
 */
public class TestSimpleCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle objectCircle = new Circle();
		System.out.println("Area of circle with radius " + objectCircle.radius
				+ " is " + objectCircle.getArea());
		Circle objectCircle2 = new Circle(25);
		System.out.println("Area of circle with radius " + objectCircle2.radius
				+ " is " + objectCircle2.getArea());
		Circle objectCircle3 = new Circle(125);
		System.out.println("Area of circle with radius " + objectCircle3.radius
				+ " is " + objectCircle3.getArea());
		// modify radius
		objectCircle2.radius = 100;
		System.out.println("Area of circle with radius " + objectCircle2.radius
				+ " is " + objectCircle2.getArea());

	}

}
