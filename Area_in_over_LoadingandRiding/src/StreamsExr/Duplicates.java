package StreamsExr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// How to find duplicate elements in a given integers 
//list in java using Stream functions?

public class Duplicates {

	public static void main(String[] args) {
		
		List<Integer> a=Arrays.asList(11,23,45,78,55,89,78,11,45,65,78);
		Set<Integer> set=new LinkedHashSet<Integer>();
		a.stream().filter(n -> !set.add(n)).forEach(System.out::println);

	}

}
