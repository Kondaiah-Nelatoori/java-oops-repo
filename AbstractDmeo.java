package com.java.practice.oops;

abstract class Human {
	public void eat() {
		System.out.println("Eat Pizza");
	}

	public void walk() {
		System.out.println("Walk to Park");
	}

	abstract void sleep();

}

class Man extends Human { // Concrete

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Should sleep 8 hours");
	}

}

public class AbstractDmeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human obj = new Man();
		obj.eat();
		obj.walk();
		obj.sleep();

	}

}
