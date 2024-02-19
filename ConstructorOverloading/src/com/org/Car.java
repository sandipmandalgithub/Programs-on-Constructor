package com.org;
// CONSTRUCTOR CHAINING EXAMPLE -2

public class Car {

	String brand;
	int cost;
	
	Car(String brand){
		this.brand=brand;
	}
	Car(String brand,int cost){
		this(brand);
		this.cost=cost;
	}

	public static void main(String[] args) {
		Car c=new Car("SUZUKI",200);
		
		System.out.println("BRAND :"+c.brand);
		System.out.println("COST  :"+c.cost);

	}

}




