package com;

public class Solution {

	public static void main(String[] args) {
		Mobile m1=new Mobile("REALME");
		System.out.println("brand is :"+m1.brand);
		
		Mobile m2=new Mobile(120000);
		System.out.println("cost is :"+m2.cost);
		
		Mobile m3=new Mobile("REALME",120000);
		System.out.println("brand is :"+m1.brand+" and cost is :"+m3.cost);
		
		Mobile m4=new Mobile(120000,"REALME");
		System.out.println("cost is :"+m4.cost+" and brand is :"+m4.brand);
		

	}

}
