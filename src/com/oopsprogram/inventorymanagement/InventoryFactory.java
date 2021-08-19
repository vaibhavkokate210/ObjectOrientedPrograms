package com.oopsprogram.inventorymanagement;

public class InventoryFactory
{
	Inventory[] Invent;
	static int count=0;
	public InventoryFactory()
	{
		Invent=new Inventory[3];
	}
	public void createInventory(String name, int weight,int pricePerKg)
	{
		Invent[count++]=new Inventory(name,weight,pricePerKg);
	}
	public void calculateInventory()
	{
		for(int i=0;i<count;i++)
		{
			Invent[i].setTotalValue(this.calculateInventory(Invent[i]));
			System.out.println(Invent[i]);
		}
	}
	public int calculateInventory(Inventory Invent)
	{
		int totalValue=0;
	    totalValue = Invent.weight*Invent.pricePerKg;
		return totalValue;
	}
	
}
