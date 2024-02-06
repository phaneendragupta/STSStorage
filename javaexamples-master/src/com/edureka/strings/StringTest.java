package com.edureka.strings;

public class StringTest {
	
//	public void Display() {
//		System.out.println("Hello World");
//	}

	static public void main(String... args) {
		
		String s1 = "   sweety hadassa";
		String s2 = "sweety";
		System.out.println(s1 == s2); //to check memory references
		
		
		String s3 = new String("Java Edureka");
		String s4 = new String("java");
		
		System.out.println(s3 == s4);
		
		System.out.println(s1.equals(s2)); //to check the content of string
		
		s1.concat("grace");
		System.out.println(s1);// no changes in string literal
		
		String s5 =s1.concat("grace");
		System.out.println(s5);
		
		System.out.println(s3.contentEquals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println("Size = "+s3.length());
		System.out.println(s3.charAt(0));
		System.out.println(s4.indexOf("j"));
		System.out.println(s1.trim());
	
//		System.out.println(s1);
		
//		StringTest a = new StringTest();
//		a.Display();

	}

}
