package com.edureka.employee;

public class Employee {
	
	int empno;
	String name;
	float sal;
	
	void setDetails() {
		empno = 102;
		name = "Pravallika";
		sal = 200000f;
	}
	
	void displayDetails() {
		System.out.println(empno + " | " + name + " | " + sal);
	}
	
	public static void main(String[] args) {
		System.out.println("Inside employee class");
	}

}
