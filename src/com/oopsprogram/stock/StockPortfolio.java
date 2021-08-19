package com.oopsprogram.stock;

public class StockPortfolio 
{
	static int totalValueOfAllStocks;
	public static void calculateValueOfStock(Stock[] st)
	{
		for(int i=0;i<st.length;i++)
		{
			int totalStockValue=0;
			totalStockValue=st[i].noOfShare*st[i].sharePrice;
			totalValueOfAllStocks+=totalStockValue;
			System.out.println(st[i]+"\t\t\t"+totalStockValue);
		}
	}
	public static void main(String[] args) 
	{
		Stock[] st=new Stock[5];
		st[0]=new Stock("HCL",100,200);
		st[1]=new Stock("Tata",1000,100);
		st[2]=new Stock("Mindtree",200,50);
		st[3]=new Stock("Adani",200,400);
		st[4]=new Stock("Nestle",800,200);
		System.out.println("Stock Name\t\tNo of Share\t\tshare price\t\tTotal Value of share");
		System.out.println("==============================================================================================");
		calculateValueOfStock(st);
		
		System.out.println("==============================================================================================");
		System.out.println("Total Value of all shares = "+totalValueOfAllStocks);
	}

}
