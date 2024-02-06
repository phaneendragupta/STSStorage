package javaPractice.EmpPojoCls;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> empDetails=new ArrayList<Employee>();
		
		empDetails.add(new Employee(120,"Raghav","CyberSecurity","USA"));
		empDetails.add(new Employee(125,"Parth","IT","Denmark"));
		empDetails.add(new Employee(180,"Harpreeth","Networking","Spain"));

		for(Employee i:empDetails) {
		System.out.println(i);	
		}
		
	}

	

}
