package com.oopsprogram.cardshuffle;

public class DeckOfCards 
{
	public static void ShuffleCards()
	{
		String suit[]= {"Clubs","Diamonds","Hearts","Spades"};
		String rank[]= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String shuffle[]=new String[52];
		String player1[]=new String[13];
		String player2[]=new String[13];
		String player3[]=new String[13];
		String player4[]=new String[13];
		int p1=0,p2=0,p3=0,p4=0;
		
		for(int i=0;i<suit.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			{
				boolean condition=true;
				String combine=suit[i]+" "+rank[j];
			   
				while(condition)
				{
					int random=(int) (Math.floor(Math.random()*1000)%52);
					if(shuffle[random]==null)
					{
						shuffle[random]=combine;
						condition=false;
					}
				}
			}
		}
		
		for(int k=0;k<shuffle.length;k++)
		{
			if(k%4==0)
				player1[p1++]=shuffle[k];
			else if(k%4==1)
				player2[p2++]=shuffle[k];
			if(k%4==2)
				player3[p3++]=shuffle[k];
			if(k%4==3)
				player4[p4++]=shuffle[k];
		}
		
		System.out.println("Player 1                  Player 2                 Player 3                  Player 4");
		System.out.println("===============================================================================================");
		for(int i=0;i<13;i++)
		{
			System.out.print(player1[i]+"              "+player2[i]+"                "+player3[i]+"                   "+player4[i]);
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		ShuffleCards();
	}
}

