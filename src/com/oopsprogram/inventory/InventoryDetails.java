package com.oopsprogram.inventory;


public class InventoryDetails 
{
	public static void calculateEventory(Inventory[] invent)
	{
		System.out.println("****************************************************************************");
		System.out.println("                      INVENTORY");
		System.out.println("****************************************************************************");
		System.out.println("Inventory Name           Weight          Price per KG        Total Value");
		System.out.println("-----------------------------------------------------------------------------");
		for(int i=0;i<invent.length;i++)
		{
			int totalvalue=invent[i].weight*invent[i].pricePerKg;
			System.out.println(invent[i]+"                "+totalvalue);
		}
	}
	public static void main(String[] args) 
	{
		Inventory[] invent=new Inventory[3];
		invent[0]=new Inventory("Rice",20,50);
		invent[1]=new Inventory("Pulses",10,100);
		invent[2]=new Inventory("Wheats",50,30);
		calculateEventory(invent);
	}

}

