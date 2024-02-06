package StreamsExr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrintP {

	public static void main(String[] args) {
      List<String> L1= Arrays.asList("Raghav","Parvezh","pavan","charan","Phani","shekar");
      
	List<String> L2=L1.stream().filter(n -> n.contains("p")||  n.contains("P"))
			          .map(n->n.toLowerCase())
	            .collect(Collectors.toList());
	            //.forEach(System.out::println);
	
	System.out.println(L2);
	}

}
 