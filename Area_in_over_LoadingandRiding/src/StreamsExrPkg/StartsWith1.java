package StreamsExrPkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith1 {
	public static void main(String[] args) {

	
	List<Integer> L1= Arrays.asList(10,15,8,49,25,98,32);
System.out.println(	L1.stream().map(a -> a +" ").filter(b->b.startsWith("1")).collect(Collectors.toList()));
	
	}
}
