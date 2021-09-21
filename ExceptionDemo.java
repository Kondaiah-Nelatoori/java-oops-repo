package com.java.practice.oops;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Hello");
			int i = 7 / 0;
		} catch (Exception e) {
			System.err.println("Error " + e);
		}

		finally {
			System.out.println("Bye");
		}

	}

}
