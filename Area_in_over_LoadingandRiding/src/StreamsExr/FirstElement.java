package StreamsExr;

import java.util.Arrays;
import java.util.List;

//Given the list of integers, find the first element of the list using Stream functions?
public class FirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> L= Arrays.asList(13,24,58,90,23);
		L.stream().findFirst().ifPresent(System.out::println);;
		
	}

}
