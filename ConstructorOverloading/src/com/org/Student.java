package com.org;
//CONSTRUCTOR CHAINING EXAMPLE-1

public class Student {
	int age;
	String name;
	
	Student(int age){
		this.age=age;
	}
	Student(int age,String name){
		//this.age=age;
		this(age);// CONSTRUCTOR CHAINING
		this.name=name;
		
	}
	public static void main(String[] args) {
		Student s=new Student(22,"Tom");
		System.out.println("Age: "+s.age);
		System.out.println("Name: "+s.name);
	}

}
