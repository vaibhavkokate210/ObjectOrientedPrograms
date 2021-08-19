package com.oopsprogram.inventorymanagement;

public class Inventory {
	String name;
	int weight;
	int pricePerKg;
	int totalValue;
	public Inventory(String name, int weight, int pricePerKg) 
	{
		super();
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}
    
	public void setTotalValue(int totalValue)
	{
		this.totalValue+=totalValue;
	}
	@Override
	public String toString() 
	{
		return name + "                      " + weight + "                  " + pricePerKg+"                  "+totalValue;
	}
	
}
