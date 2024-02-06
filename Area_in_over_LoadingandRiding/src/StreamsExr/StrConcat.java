package StreamsExr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StrConcat {

	public static void main(String[] args) {
		

		 List<String> list1 = Arrays.asList("Java", "8", "vdg");
		 List<String> list2 = Arrays.asList("explained", "through", "programs");
		 
		 Stream<String> concatStr=Stream.concat(list1.stream(),list2.stream());
		// List<String> list3=concatStr.collect(Collectors.toList());
		 concatStr.forEach(s -> System.out.println(s));
		// System.out.println(list3);
		 
		 

	}

}
