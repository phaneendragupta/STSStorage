package StreamsExr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LowerCase {

	public static void main(String[] args) {
		List<String> L2=new ArrayList<String>();
		List<String> L1=Arrays.asList("Shekar","ram","Rakesh","Sahil","suresh");
		
		L2=L1.stream().filter(str -> str.startsWith("S") || str.startsWith("s")).map(st -> st.toLowerCase())
		                                                                     .collect(Collectors.toList());
		                                                                     //.forEach(n -> System.out.println(n));

		System.out.print(L2);
		

    
		
//    
//	Scanner sc=new Scanner(System.in);
//	String S= sc.next();	
//	int n=S.length();
//	String S1="";
//	 for(int i=n-1;i>=0;i--) {
//		 S1+=S.charAt(i);
//		  }
//	 System.out.println(S1);
//		}
//	
//	
	}	
}