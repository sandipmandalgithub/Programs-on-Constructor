package com.ConstructorChaining;

public class B extends A{
	B(){
		super(10);
		System.out.println("inside B constructor");

	}

	public static void main(String[] args) {

		System.out.println("App Start");
		new B();
		System.out.println("App End");


	}

}
