package javaPractice;

/*5) Write a program to get the occurrence of a specific letter in a given String.
i/p="Hello"
i/p=l
o/p=2 
*/
public class SpecOccNum {
	public static void main(String[] args) {
		
	     String S="Hello";
	     int n=S.length();
	     int c=0;
//	    char[] p = S.toCharArray();
//	     String arr[] = p.toString();
	   for(int i=0 ;i<n; i++) {  
	    if( S.charAt(i) == 'l'){
	    	c++;}
	    	
	    	
	    }
	     System.out.println(c);
	    	

		
	}
	
}
