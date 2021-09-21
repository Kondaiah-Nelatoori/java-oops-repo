package com.java.practice.oops;

class Emp{
	int eid;
	int sal;
	
	static String ceo;
	
	
//	static {           //It will load when by the time of class loading into JVM.
//		ceo= "Harsha";//since we don't change the value static variable manually 
//	}                 //i.e, by calling this property using class name or object
	
	void show(){
		System.out.println(eid+ " :"+sal+" :"+ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp raja = new Emp();
		raja.eid = 259;
		raja.sal=30000;
		Emp.ceo="sai";
		raja.ceo="Sai";
		
		
		
		Emp srujana = new Emp();
		srujana.eid = 237;
		srujana.sal=30000;
		//srujana.ceo="Sai";
		
		srujana.ceo = "siva";
		raja.show();
		srujana.show();
	}

}
