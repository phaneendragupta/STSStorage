package com.edureka.exceptions;

public class Except2 {

	public static void main(String[] args) {
		String data = "625";
		System.out.println(data+25); //62525
		
		int n = Integer.parseInt(data); //converting string to integer
		System.out.println(n+25); //650
		
		data = "A";
		n = Integer.parseInt(data);

	}

}
