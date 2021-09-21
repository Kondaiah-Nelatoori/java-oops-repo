package com.java.practice.oops;

 class Casio{
	void add(int i, int j){
		System.out.println(i+j);
	}
	
	void add(int i, int j, int k){
		System.out.println(i+j+k);
	}
	
	
}
 
 
 
public class MethodeOverloadingDemo {

	public MethodeOverloadingDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Casio obj = new Casio();
		obj.add(237,259);
		
		obj.add(7, 9, 9);
	}

}
