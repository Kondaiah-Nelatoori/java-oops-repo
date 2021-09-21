package com.java.practice.oops;

class Student {
	int sid;
	String course;
	// System.out.println("hello");

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", course=" + course + "]";
	}

	public Student(int sid, String course) {
		super();
		this.sid = sid;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st[] = new Student[3];
		
		st[0] = new Student(1,".NET");
		st[1] = new Student(2,"java");
		st[2] = new Student(3,"Js");
		
		for(Object obj : st)
		System.err.println(obj);

	}

}
