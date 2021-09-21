package com.java.practice.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		int num = 0;
		System.out.println("Enter number");
		
		BufferedReader br = null;
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		num = Integer.parseInt(br.readLine());
//		
//		System.out.println(num);
//		
//		br.close();
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			num = Integer.parseInt(br.readLine());
			//System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.err.println("Error "+ e);
		}
		finally {
			br.close();
		}
		System.out.println(num);
		
		
//		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//			num = Integer.parseInt(br.readLine());
//		}
//		System.out.println(num);  // Updated try block in 1.7 version no need to write a catch block if we r only using to close the resources
	}

}
