package StreamsExrPkg;

public class Str {
	public static void main(String[] args) {
		String S1="Capgemini";
		String S2="";
		int L1=S1.length();
		for (int i=0;i<L1;i++) {
			if((i+1)%3==0) {
				S2= S2 +"$";
	
			}
			
			
			else { 
			S2=S2 +S1.charAt(i);
			}
			
			
		}
		
		System.out.println(S2);
		
		
		
	}

}
