package javaPractice.FieldsandSalary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Fields> A=new ArrayList<>();
		
		A.add(new Fields(1,"Shekar",40000));
		A.add(new Fields(2,"Raghu",80000));
		A.add(new Fields(3,"Srikar",35000));
		A.add(new Fields(4,"Pranav",50000));
	
		
		//sort using Comparable
		Collections.sort(A);
		for(Fields i:A) {
			System.out.println(i);
		}
		
		
//		//sort using Comparator using id and name
//				Collections.sort(A, new Fields());
//				for(Fields i:A) {
//					System.out.println(i);
//				}
		
		
	}

}
