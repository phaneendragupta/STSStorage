package com.java.basic;

public class StringCheck {

	public static void main(String[] args) {
		
		String s = "Phani";
		String s1 = "Krishna";
		String p = new String("Phani");
		String p1 = new String("Krishna");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		System.out.println(s);
		System.out.println(s1);
		System.out.println(p);
		System.out.println(p1);
	}
}
