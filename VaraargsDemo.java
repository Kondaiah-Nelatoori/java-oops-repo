package com.java.practice.oops;

class Cal{
	 public int add(int ...n) {
		 int sum = 0;
		 for(int i:n) {
			 sum = sum+i;
		 }
		return sum;
	}
}

public class VaraargsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal cal = new Cal();
		System.out.println(cal.add(1,2,5,3,6,7,8,3,25,37));
		int num[] = {1,3,4,2,5,7};
		System.out.println(cal.add(num));
	}

}
