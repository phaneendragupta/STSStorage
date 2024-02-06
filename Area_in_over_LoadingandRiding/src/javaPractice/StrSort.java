package javaPractice;

import java.util.Arrays;

/*write a program to a sort a Array of String in ascending oreder alphabetially
i/p String s=["Capgemini","Accenture","TCS","EPAM"]
o/p =[Accenture,Capgemini,EPAM,TCS]*/

public class StrSort {
public static void main(String[] args) {
	
	String[] s = {"Capgemini","Accenture","TCS","EPAM"};
	
	
	Arrays.sort(s);
	
	System.out.println(Arrays.toString(s));
	
}
	
}
