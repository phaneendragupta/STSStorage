package StreamsExrPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrApp {


		public static void main(String[] args) {
		
//			List<String> S= List.of("akash","charan","Ganesh","gaurav","Srikar");
//		
//		List<String> L1= new ArrayList<>();
//				S.stream()
//             .filter(n->n.startsWith("g")||n.startsWith("G"))
//             .map(s->s.substring(0, 2).toUpperCase()+s.substring(2))
//             .collect(Collectors.toList())
//             .forEach(d->System.out.println(d));
//             
             //.forEach(d->  L1.add(d));
             
             
             //.collect(Collectors.toList());
			
		//System.out.println(L1);
			
			
			
			List<String> list1 = Arrays.asList("Java", "8");
			 List<String> list2 = Arrays.asList("explained", "through", "programs");
			 Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());

			 // Concatenated the list1 and list2 by converting them into Stream
			 concatStream.forEach(str -> System.out.print(str + " "));

			
		}
	
}
	