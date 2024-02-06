package javaPractice;

import java.util.ArrayList;
import java.util.Scanner;
//************************************
public class PrintPrimeNums {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		ArrayList<Integer> primeNumbers= new ArrayList<>();
	   int n=s.nextInt();	
	    for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        // Print the list of prime numbers
        System.out.println(primeNumbers);
    }


    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


		
	}


