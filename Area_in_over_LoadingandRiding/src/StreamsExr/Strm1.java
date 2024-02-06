package StreamsExr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Strm1 {
	public static void main(String[] args) {
	List<Double> b=new ArrayList<>();
	
List<Integer> L1= Arrays.asList(1,2,3,4,5,6,78,9,10);
b=L1.stream().map(n -> Math.pow(n,3)).filter(n -> n>=50)
.collect(Collectors.toList());
 //forEach(System.out::println);
   
System.out.println(b);
	}
}
