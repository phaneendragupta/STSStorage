package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Array3rdHighest {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a= new int[n];
		int x=0;
		for (int i=0;i<n;i++) {
			
			a[i]=s.nextInt();
		}
		
		Arrays.sort(a);
		for (int i=n-1;i>=0;i--) {
			
			if (a[i]!=a[i-1]) {
				
				x++;
				
				if(x==3) {
					System.out.println(a[i]);
				}
			}
			
		}
		
	}

}
