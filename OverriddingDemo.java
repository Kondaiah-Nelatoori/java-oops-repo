package com.java.practice.oops;

  class A{
	void show() {
		System.out.println("in A");
	}
	void disply() {
		System.out.println("in a");
	}
	
	
}

class B extends A{
	
	void show(){
		System.out.println("in B");
	}
}

class C extends B{
	void show() {
		System.out.println("in C");
	}
}

public class OverriddingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.show();
		obj.disply();
		
		System.out.println("=========");
		B obj1 = new B();
		obj1.show();
		obj1.disply();
		
		System.out.println("========");
		A obj2 = new B();// Run time Polymorphism
		obj2.show();
		obj2.disply();
		
		System.out.println("=========");
		//B obj3 =  new A();
		System.out.println("B obj3 =  new A(); won't be working because we extends only A to B");
		
		System.out.println("=========");
		obj2 = new C();//Dynamic Method dispatch
		obj2.show();

	}

}
