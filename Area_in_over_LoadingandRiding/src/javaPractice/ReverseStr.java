package javaPractice;

public class ReverseStr {
public static void main(String[] args) {
	
     String S="Capgemini";
	    int n=S.length();
		String S1=" ";

	    for(int i=n-1;i>=0;i--) {
	    	
	    	S1+=S.charAt(i);
	    	}
	 
	    System.out.println(S1);

}
}
