package StreamsExr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strlength {

	public static void main(String[] args) {
 List<String> L1=Arrays.asList("Suresh","Ram","karthik","Anil","Fergussion");
 
 Long n1=L1.stream().filter(n->n.length()>5).count()	;
 System.out.println(n1);
 
// collect(Collectors.toList()).forEach(System.out::println);
	

	}

}
