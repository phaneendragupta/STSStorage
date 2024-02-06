package com.edureka.polymorphism;

public class AbsTest {

	public static void main(String[] args) {
		Shape shape = null;
		//shape = new Shape();//Cannot instantiate the type Shape as shape is abstract class
		
		shape = new Rectangle("Red",5.6f,2.3f);
		System.out.println("Color = "+ shape.getColor());
		shape.setColor("Blue");
		shape.area(); //shape is acting as shape of rectangle
		
		System.out.println("=============================");
		
		shape = new Circle("Yellow",5.2f);
		shape.area(); // shape is acting as shape of circle

	}

}
