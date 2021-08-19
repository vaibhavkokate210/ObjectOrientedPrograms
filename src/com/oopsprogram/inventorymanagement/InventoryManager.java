package com.oopsprogram.inventorymanagement;


public class InventoryManager 
{
	public static void main(String[] args)
	{
		InventoryFactory InventFactory=new InventoryFactory();
		InventFactory.createInventory("Rice", 20, 50);
		InventFactory.createInventory("Pulses", 10, 100);
		InventFactory.createInventory("Wheats", 50, 30);
		System.out.println("Inventory Name           Weight          Price per KG        Total Value");
		System.out.println("-----------------------------------------------------------------------------");
		InventFactory.calculateInventory();
	}

}
