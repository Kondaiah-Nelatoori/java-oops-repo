package com.java.practice.oops;


abstract class Writter{
	
	abstract   void Book();
}

class Pen extends Writter {

	@Override
	void Book() {
		// TODO Auto-generated method stub
		System.out.println(" Write Something in Book");
	}
	
	void signature() {
		System.out.println("Put Signature with Pen");
	}

	
	
} 

class Pencil extends Writter{

	@Override
	void Book() {
		// TODO Auto-generated method stub
		
		System.out.println(" Draw a Triangle in book");
	}
	
}

public class AbstractPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Writter obj = new Pen();
		obj.Book();
		
		
		Writter obj1 = new Pencil();
		obj1.Book();
		 

	}

}
