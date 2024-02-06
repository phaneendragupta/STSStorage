package javaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/*
)write a program to Count the number of alphabets in a given sentence
i/p="Capgemini"
o/p = {C-1,a-1,p-1,g-1,e-1,m-1,i-2,n-1}*/
public class CountAlpha {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String S1=s.next();
		int l=S1.length();
	
		char[] c=S1.toCharArray();
		LinkedHashMap<Character, Integer> m=new LinkedHashMap<>();

	
	for(int i=0;i<l;i++) {
		int t=0;
		for(int j=0;j<l;j++) {
			
			if(c[i]==c[j]) {
				
				t++;
			}
			
			
		}	
		m.put(c[i], t);
	}
	System.out.println(m);

}
}