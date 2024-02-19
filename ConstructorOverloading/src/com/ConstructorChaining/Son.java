package com.ConstructorChaining;

public class Son extends Father {
	Son()
	{
		super(40);
		System.out.println("I am son class Constructor");
	}
public static void main(String[] args) {
	Son s=new Son();
}
}
