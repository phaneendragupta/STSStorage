package com.edureka.constructordemo;

public class OverloadingConstructors {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
//		We don't have constructor with integer and string, we have to create one
//		When this object is created it will go to employee constructor with two parameters
		Employee emp2 = new Employee(103,"Yashh");
		Employee emp3 = new Employee(104,"Pravs",250000.0f); 
		
		emp1.displayDetails();
		emp2.displayDetails(); 
		emp3.displayDetails();

	}

}
