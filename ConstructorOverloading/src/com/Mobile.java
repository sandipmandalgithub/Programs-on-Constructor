package com;


public class Mobile {
	String brand;
	int cost;
	
	Mobile(String brand){
		this.brand=brand;
	}
	Mobile(int cost){
		this.cost=cost;
	}
	Mobile(String brand,int cost){
		this.brand=brand;
		this.cost=cost;
	}
	Mobile(int cost,String brand){
		this.cost=cost;
		this.brand=brand;
	}
	

}
