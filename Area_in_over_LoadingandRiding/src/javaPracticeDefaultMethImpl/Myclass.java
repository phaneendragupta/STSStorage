package javaPracticeDefaultMethImpl;

/*
Write a program to implement the defalut method in a Fuctional interface and override it.*/

public class Myclass implements DefIntf{
@Override
		public void  mymethod() {
			System.out.println("this is implemented method");
		}
@Override
	public void defaultmethod() {
		
		System.out.println("this is default method ");
	}


}
