package com.oopsprogram.inventory;

public class Inventory 
{
	String name;
	int weight;
	int pricePerKg;
	
	public Inventory(String name, int weight, int pricePerKg) 
	{
		super();
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}

	@Override
	public String toString() 
	{
		return name + "                      " + weight + "                  " + pricePerKg;
	}
	
}