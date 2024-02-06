package StreamsExr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lengreater3 {

	
	    public static void main(String[] args) {
	        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
	        
	    //     long count = stringList.stream().filter(str -> str.length() > 3).count();
	    //     System.out.println("String count with greater than 3 digit : " + count);
	    // }
	    
	 long l1=   stringList.stream().filter(n -> n.length()>3).count();
	 System.out.println(l1);
	    
	    //.collect(Collectors.toList()).forEach(System.out::println);
	}
}
