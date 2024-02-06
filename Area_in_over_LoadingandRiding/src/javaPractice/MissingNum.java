package javaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*
write a code to find missing number in Integer List
Test cases :
   a) 1,2,3,4,5,7,8,9,10
   b)2,4,6,10,12,14,16,18,20
   c)1,3,5,9,11,13,15,17*/

public class MissingNum {

	public static void main(String[] args) {
		
		int[] L1= {1,2,3,4,5,7,8,9,10};
		int n=L1.length;
		int m=n+1;
		int s=((m)*(m+1))/2;
		
		for(int i=0;i<n;i++) {
			s-=L1[i];
			
		}
        System.out.println(s);
		
	}

}
