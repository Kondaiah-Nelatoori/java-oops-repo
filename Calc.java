package com.java.practice.oops;

import java.util.Scanner;

public class Calc {

	private int num1;
	int num2;
	int result;
	public Calc() {
		// TODO Auto-generated constructor stub
		setNum1(6); 
		setNum2(5);
		System.out.println(getNum1()+getNum2());
	}
	Scanner scan = new Scanner(System.in);
//	num1 = getNum1();
//	num2 = getNum2();
	
	
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	

}
