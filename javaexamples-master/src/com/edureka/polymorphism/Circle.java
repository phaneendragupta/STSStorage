package com.edureka.polymorphism;

public class Circle extends Shape {
	
	float radius;
	
	Circle(String color, float rad){
		super(color);
		this.radius=rad;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle = "+(Math.PI*radius*radius));

	}

}
