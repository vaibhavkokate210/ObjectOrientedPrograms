package com.oopsprogram.stock;

public class Stock 
{
	String stockName;
	int noOfShare;
	int sharePrice;
	public Stock(String stockName, int noOfShare, int sharePrice) {
		super();
		this.stockName = stockName;
		this.noOfShare = noOfShare;
		this.sharePrice = sharePrice;
	}
	@Override
	public String toString() {
		return stockName + "\t\t\t" + noOfShare + "\t\t\t" + sharePrice;
	}
	
}

