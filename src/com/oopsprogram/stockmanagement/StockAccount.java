package com.oopsprogram.stockmanagement;

import java.util.Scanner;

public class StockAccount 
{
	String name;
	CompanyShares[] compShare;
	CompanyShares[] myShare;
	static int count=0;
	public StockAccount(String name) 
	{
		this.name = name;
		compShare=new CompanyShares[5];
		compShare[0]=new CompanyShares("Tata",100);
		compShare[1]=new CompanyShares("HUL",100);
		compShare[2]=new CompanyShares("HCL",100);
		compShare[3]=new CompanyShares("Crisil",100);
		compShare[4]=new CompanyShares("Adani",100);
		myShare=new CompanyShares[5];
	}

	public void buy(int amount,String symbol)
	{
		for(int i=0;i<compShare.length;i++)
		{
			if(symbol.equals(compShare[i].symbol))
			{
				myShare[count++]=new CompanyShares(symbol,amount);
				compShare[i].noOfShare=compShare[i].noOfShare-amount;
			}
		}
	}
	public void sell(int amount,String symbol)
	{
		for(int i=0;i<myShare.length;i++)
		{
			if(myShare[i]!=null)
			{
			if(symbol.equals(myShare[i].symbol) && myShare[i]!=null)
			{
				myShare[i].noOfShare=myShare[i].noOfShare-amount;
			}
			}
		}
	}
	public void save()
	{
		System.out.println("Accounts are saved succefully");
	}
	public void printReport()
	{
		System.out.println("=============================================================");
		System.out.println("Share symbol\t\tNo of shares");
		System.out.println("=============================================================");
		for(int i=0;i<myShare.length;i++)
		{
			if(myShare[i]!=null)
			{
				System.out.println(myShare[i].symbol+"\t\t\t"+myShare[i].noOfShare);
			}
		}
		System.out.println("=============================================================");
		System.out.println();
	}
	public static void main(String[] args)
	{
		StockAccount sa=new StockAccount("User 1");
		System.out.println("Welcome User 1");
		boolean condition=true;
		while(condition)
         {
			int choice = 0;
			System.out.println("1. Buy share \n2. Sell share \n3. Save \n4. printReport \n5. Exit");
			System.out.println("Enter your choice :");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Name of share to buy :");
			       Scanner sc1=new Scanner(System.in);
			       String symbol=sc1.nextLine();
			       System.out.println("Enter amount of shares :");
			       int amount=sc1.nextInt();
				   sa.buy(amount,symbol);;
				   break;
			case 2:System.out.println("Name of share to sell:");
		          Scanner sc2=new Scanner(System.in);
		          String symbol1=sc2.nextLine();
		          System.out.println("Enter amount of shares :");
		          int amount1=sc2.nextInt();
			      sa.sell(amount1, symbol1);;
			      break;
			case 3:sa.save();
				  break;
			case 4:sa.printReport();
				  break;
			case 5:condition=false;
			       break;
			}
	     }
		System.out.println("Thank you");
	}

}

