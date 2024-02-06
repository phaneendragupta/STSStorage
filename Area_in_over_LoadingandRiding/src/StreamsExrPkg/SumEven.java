package StreamsExrPkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumEven {

	public static void main(String[] args) {

		List<Integer> L1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int e=0;
		System.out.println(L1.stream().filter(n -> n%2==0)
	               .mapToInt(Integer::intValue)
		           .sum());           
		          // .collect(Collectors.toList())
		           
		
		
	}

}
