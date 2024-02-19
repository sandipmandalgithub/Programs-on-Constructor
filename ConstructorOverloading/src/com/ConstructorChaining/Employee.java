package com.ConstructorChaining;

public class Employee {
	Employee(int age){
		this(100,"Tom");
		System.out.println("Age:"+age);

	}
	Employee(int id,String name){
		System.out.println("Id: "+id+" Name: "+name);

	}
	Employee(double salary){
		this(25);
		System.out.println("Salary:"+salary);

	}


	public static void main(String[] args) {
		Employee e=new Employee(2.5);



	}

}
