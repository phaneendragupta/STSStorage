package javaPractice;

import java.util.Scanner;

/*write a program to return 2nd largest number from given array
		   i/p=[2,3,5,6,1,0]
		   o/p=6
*/
public class SecondLarge {

	public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      int[] a=new int[n];
      for(int i=0; i<n;i++) {
    	 a[i]=s.nextInt();
    	  }
      int temp=0;
      for(int i=0; i<n;i++) {
          for(int j=i+1; j<n;j++) {

     	 if(a[i] < a[j]) {
     		 temp=a[j];
     		a[j]=a[i];
     		 a[i]=temp;
     		 
     	 }
     	  }	
	
	}
      System.out.println(a[1]);

  

}
}