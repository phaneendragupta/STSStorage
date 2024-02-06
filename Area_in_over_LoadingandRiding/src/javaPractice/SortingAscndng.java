package javaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Write a program to sort a given list of intergers in ascending order
i/p list={2,4,0,1,56,23,4}
o/p list={0,1,2,4,4,23,56}*/

public class SortingAscndng {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,0,1,56,23,4);
		
//		Collections.sort(s1);
//		
//		for(int i:s1) {
//			System.out.println(i);
//		}
		
		int l1=list.size();
		for(int i=0;i<l1-1;i++) {
			for(int j=0;j<l1-i-1;j++) {
				 if (list.get(j) > list.get(j+1)) {
	                    // Swap list[j] and list[j+1]
	                    int temp = list.get(j);
	                    list.set(j, list.get(j+1));
	                    list.set(j+1, temp);
				
			
			}
			
			
		}
		
		
     
	}
		System.out.println(list);
		
		}
	}


