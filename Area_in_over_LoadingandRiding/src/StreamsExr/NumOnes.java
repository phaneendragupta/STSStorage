package StreamsExr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, find out all the numbers 
	//starting with 1 using Stream functions?
	
public class NumOnes {
  
	public static void main(String[] args) {
		
// TODO Auto-generated method stub
		
		List<Integer> a= Arrays.asList(13,17,28,91,33,10);
		
		//List<String> b =
				a.stream().map(m -> m + " ").filter(s -> s.startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);
		
		//System.out.println(b);

	}

}
