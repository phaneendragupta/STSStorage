package StreamsExr;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {

	public static void main(String[] args) {

		List<Integer> L1 = Arrays.asList(1,2,5,7,9,10,4,2,34,88,10,23,2,1,6,9,88);
		//LinkedHashSet<Integer> L2= new LinkedHashSet<Integer>(L1);
		LinkedHashSet<Integer> L2 =  L1.stream().collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(L2);
	}

}
