package javaPractice;

import java.util.Scanner;

/*)write a program To count number of words in a given sentence.
i/p "Hello world"
o/p = 2 words */

public class WordCount {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
	String S1=s.nextLine();
  
//  String[] S2=S1.split("\\s+");
//   System.out.println(S2.length);

	
	int n=S1.length();
	int t=0;
	for(int i=0;i<n;i++) {
		if(S1.charAt(i)==' ') {
			t++;
		}
		
	}
	
	System.out.println(t+1);
	
	}
	}
