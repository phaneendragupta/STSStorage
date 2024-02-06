package StreamsExr;

import java.util.ArrayList;

//Given a list of integers, find the total number of elements present in the list
//using Stream functions?

public class NumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> A=new ArrayList<>();
		  A.add("vmfb");
		  A.add("cdv");
//		  A.add(99);
//		  A.add(74);
//		  A.add(28);
//		  A.add(67);
		  
		 Long b = A.stream().count();
		 System.out.println(b);
       
	}

}
