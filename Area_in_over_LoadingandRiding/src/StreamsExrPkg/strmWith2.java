package StreamsExrPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class strmWith2 {
	public static void main(String[] args) {
		List<Integer> L1=Arrays.asList(12,15,20,34,72);
System.out.println(	L1.stream().map(n-> n+"").filter(a->a.endsWith("2"))
			                 .mapToDouble(b->Double.parseDouble(b)).average());
		
		
		
	}
}

//}
//ArrayList<String> L1=ArrayList<>{"Java","Maps","Hash"};
//
//Map<Integer,ArrayList> M1= HashMap<>(1,L1);