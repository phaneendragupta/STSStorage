package StreamsExrPkg;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Str1 {

	public static void main(String[] args) {
	
		List<Integer> temp= List.of(12,13,11,15,79,03,56);
		
		System.out.println(temp.stream().filter(n -> n>13)
				.count()
//				.sorted(Comparator.reverseOrder())
//		.collect(Collectors.toList())
		
				);
		
		
	}
	
}
