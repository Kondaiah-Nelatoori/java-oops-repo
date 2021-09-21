package com.java.practice.oops;

 class Outer{
	
	int i;
	String name;
	
	void  show() {
		
	}
	
	private class Inner {    //class fileName :- Outer$Inner.class
		String name = "raja";
		void display() {
			System.out.println("Display from inner "+ name);
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj = new Outer();
		
//		Outer.Inner obj1 = obj. new Inner();//Object creation of member class
//	obj1.display();                     // To create a for object for member class
		                                    //must have to create object outer class 
		
//		Outer.Inner obj2 =  new Outer.Inner();//Object creation of static class
//		obj1.display();                         // No need to create object for outer class
		
	}

}
