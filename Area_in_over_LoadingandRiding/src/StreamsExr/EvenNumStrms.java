package StreamsExr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given a list of integers, find out all the even numbers exist in 
//the list using Stream functions?

public class EvenNumStrms {
	public static void main(String[] args) {
		int b;

		List<Integer> a= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
	  a.stream().filter(n -> n%2==0).forEach(System.out::println);
	//	  a.stream().map(m -> Math.pow(m,3)).filter(n-> n>=50).forEach(System.out::println);


	}

}
