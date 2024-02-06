package com.edureka.packages;

import static java.lang.Math.*; //using java.lang.Math package

public class MathTest {

	public static void main(String[] args) {
		
		System.out.println(E); //calling from math class
		System.out.println(PI);
		
		System.out.println(sin(0));
		System.out.println(cos(0));
		
		System.out.println(sqrt(25));
		System.out.println(max(10, 20));
		System.out.println(min(10, 20));
		
		double rand = random();
		System.out.println(rand);
		
		int otp=(int)(rand*10000);
		System.out.println("OTP = "+otp);
		
		System.out.println(Math.floor(10.9));//no need of Math. as its package is imported
		System.out.println(Math.ceil(10.1));
	}

}
