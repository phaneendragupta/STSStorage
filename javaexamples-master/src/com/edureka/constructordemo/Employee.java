package com.edureka.constructordemo;

public class Employee {
	
	int empno;
	String name;
	float sal;
	
	Employee() {
	}
	
	//Constructor with two parameters
	Employee(int empno, String name){
		this.empno = empno;
		this.name = name;
	}
	
	//Constructor with three parameters
	Employee(int a, String b,float c){
		this(a,b); //Constructor chaining(one constructor is calling other)
		/*
		empno = a;
		name = b;
		*/
		sal = c;
	}
	
	void displayDetails() {
		System.out.println(empno + " | " + name + " | " + sal);
	}

}
