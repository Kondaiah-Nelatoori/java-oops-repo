package com.java.practice.oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Kunni");

		Collection values = new ArrayList();
		values.add(5);
		values.add("Raja");
		values.add(7);
		values.add("siva");

		System.out.println(values);

		values.remove(5);

		System.out.println(values);
		
		Iterator it = values.iterator();
		System.out.println("==========");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		List value = new ArrayList();
		value.add(5);
		value.add("Raja");
		value.add(7);
		value.add("siva");

		System.out.println(value);

		value.add(2, "Sai");

		System.out.println(value);
		
		Iterator it1 = value.iterator();
		System.out.println("==========");
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("============");
		for(int i=0; i<value.size(); i++) {
			System.out.println(value.get(i));
		}

		System.out.println("============");
		for(Object o:value)
		{
			System.out.println(o);
		}
	}

}
