package javaPractice;

import java.util.Scanner;

//Write a java program for palindrome in normal way as well as using Command line arguments.
//i/p="MADAM"
//o/p MADAM is a Pallendrome

public class Palindrome {
	
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 String S1=sc.next().toUpperCase();
		 int l1=S1.length();
		 int p1=0,p2=0;
		  
		 for(int i=0;i<l1;i++) {
			 
			 if(S1.charAt(i)==S1.charAt(l1-1-i)) {
				 p1++;
				 
			 }
			 
			 else {
                   p2++;
			 }
			 
		 }
		 
	             if(p2>0)   {
			 
			 System.out.println(S1+" is not a palindrome");
		 }
		 
		 else {
			 System.out.println(S1 +" is a palindrome");

		 }
		 
		 
		 
		 
	}

}
