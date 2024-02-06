package com.edureka.interfaces;

public class NumsImpl implements Nums {

	@Override
	public void addNum(int x, int y) {
		System.out.println("Sum = "+(x+y));
		
	}

	@Override
	public void subNum(int x, int y) {
		System.out.println("Diff = "+(x-y));
		
	}

	public static void main(String[] args) {
		
		//NumsImpl obj1 = new NumsImpl();
		Nums obj = new NumsImpl(); //obj can be referred to any class that implements Nums class
		
		System.out.println(obj.n);
		System.out.println(Nums.n);
		System.out.println(NumsImpl.n);
		
		obj.addNum(11, 22);
		obj.subNum(20, 10);
		
		//obj.n= 20; //gives compilation error as n is final
		

	}

}
