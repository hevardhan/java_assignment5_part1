package assignment5_part1;

public class Main {
	
	public static void main(String[] args) {
		
		Circle c = new Circle(35);
		System.out.println("Circle");
		System.out.printf("Area: %.2f",c.Area());
		System.out.printf("\nPerimeter: %.2f",c.Perimeter());
		
		@SuppressWarnings("unused")
		Rectangle r = new Rectangle(102,44);
		System.out.println("\n\nRectangle");
		System.out.printf("Area: %.2f",c.Area());
		System.out.printf("\nPerimeter: %.2f",c.Perimeter());
		
		@SuppressWarnings("unused")
		Triangle t = new Triangle(10,20,5,20,14);
		System.out.println("\n\nTriangle");
		System.out.printf("Area: %.2f",c.Area());
		System.out.printf("\nPerimeter: %.2f",c.Perimeter());
		
		
	}

}