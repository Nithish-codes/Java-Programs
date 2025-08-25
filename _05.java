package programs;

public class _05{
	public static void main(String[] args) {
		Circle o1 = new Circle(5);
		o1.area();
		
		Rectangle o2 = new Rectangle(10,5);
		o2.area();
	}
}

 class Shape{
	double length,height;
	public Shape(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	//Default constructor
	public Shape() {
		
	}
	public void area() {
		System.out.println("Area = " + length*height);
	}
}


 class Circle extends Shape{
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void area() {
		System.out.println("Area ≈ " + Math.PI*radius*radius);
	}
}


 class Rectangle extends Shape{
	double length,width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void area() {
		System.out.println("Area = " + length*width);
	}
}
 
 
 
 
 
 
 
 
 
 
 
 

