package com.org;
// CONSTRUCTOR CHAINING EXAMPLE-3


public class Employee {
	int id;
	String name;
	int salary;

	Employee(int id){
		this.id=id;

	}
	Employee(int id,String name){
		this(id);
		this.name=name;

	}
	Employee(int id,String name,int salary){
		this(id,name);
		this.salary=salary;

	}

	public static void main(String[] args) {
		Employee e=new Employee(1,"SANDIP",50000);
		System.out.println("ID     :"+e.id);
		System.out.println("NAME   :"+e.name);
		System.out.println("SALARY :"+e.salary);	

	}

}
