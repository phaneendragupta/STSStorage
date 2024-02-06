package StreamsExr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> Max=Arrays.asList(12,34,79,90,47,84);
		int b=Max.stream().max(Comparator.naturalOrder()).get();
		System.out.println(b);

	}

}
