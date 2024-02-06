package StreamsExr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Q10 Given a list of integers, sort all the values present in it in descending order using Stream functions?
*/

public class SortDec {

	public static void main(String[] args) {

		 List L1=Arrays.asList(22,54,76,89,12,99,35,64);
		 L1.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
	}

}
