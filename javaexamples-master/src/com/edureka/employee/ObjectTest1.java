package com.edureka.employee;

public class ObjectTest1 {
	
	public static void main(String[] args) {
		//creating employee object
		Employee emp = new Employee();
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);
		
		//change object state using reference
		emp.empno = 101;
		emp.name = "Hadassa";
		emp.sal = 25000f;
		emp.displayDetails();
		
		//change object state using method
		emp.setDetails();
		emp.displayDetails();
		
	}

}
