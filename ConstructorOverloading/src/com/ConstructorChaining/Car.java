package com.ConstructorChaining;

public class Car extends Vehicle{
	Car(){
		this("red");
		System.out.println("blue");	
	}
	Car(String clr){
		this(10000);	
	}
	Car(int price){
		super();	
	}

	public static void main(String[] args) {
		System.out.println("app start");
		new Car();
		System.out.println("app end");
		
		

	}

}
