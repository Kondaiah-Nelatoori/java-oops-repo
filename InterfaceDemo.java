package com.java.practice.oops;

interface Showable {
	void show();

	void display();

//	default void show() {
//		System.out.println("from showable default");
//	}
	
	static void greeting() {
		System.out.println("Good Night");
	}

}

@FunctionalInterface
interface Addable {
	int add(int a, int b);

	default void show() {
		System.out.println("from default methode");
	}

	default int mul(int a, int b) {
		return a * b;

	}
}

class Anything implements Showable, Addable {

//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("I'm Engineer");
//	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		Addable.super.show();
//	}

//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		Showable.super.show();
//	}

	@Override
	public void show() {
		System.out.println("from default methode");
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Showable obj = new Anything();
		obj.show();

		System.out.println("=============");
		Showable obj1 = new Showable() {

			@Override
			public void show() { // it's implemented here to avoid create
				// TODO Auto-generated method stub // a class to implements an interface.
				System.out.println("I'm Dveloper");
			}

			public void display() {
				System.out.println("Java");
			}

		};

		obj1.show();
		obj1.display();

		System.out.println("==========");

		Addable addObj = (a, b) -> (a + b);

		System.out.println(addObj.add(237, 259));
		addObj.show();

		System.out.println(addObj.mul(7, 9));
		
		
		Showable.greeting();

	}

}
