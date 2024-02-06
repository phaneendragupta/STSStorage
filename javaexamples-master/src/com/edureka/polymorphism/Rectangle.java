package com.edureka.polymorphism;

public class Rectangle extends Shape {
	
	float length,breadth;
	
	Rectangle(String color, float len, float bre){
		super(color);
		this.length=len;
		this.breadth=bre;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle = "+(this.length*this.breadth));

	}

}
