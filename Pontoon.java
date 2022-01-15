package com.bham.pij.assignments.pontoon;

//Aldea Paul 2210814

public class Pontoon extends CardGame{

	public Pontoon(int nplayers) {
		super(nplayers);
	}

	@Override
	public void dealInitialCards() {
		for(int i = 0; i < players.size(); i++) 
		{
			players.get(i).dealToPlayer(deck.dealRandomCard());
			players.get(i).dealToPlayer(deck.dealRandomCard());
		}
	}

	@Override
	public int compareHands(Player hand1, Player hand2) {
		
		int pTotal = hand1.getNumericalHandValue().size();
		int p2Total = hand2.getNumericalHandValue().size(); 
		
		System.out.println(hand1.getNumericalHandValue().get(pTotal - 1));
		System.out.println(hand2.getNumericalHandValue().get(p2Total - 1));
		if (hand1.getNumericalHandValue().get(pTotal-1) > hand2.getNumericalHandValue().get(p2Total - 1)) 
			return -1;
		else 
			if (hand1.getNumericalHandValue().get(pTotal - 1) < hand2.getNumericalHandValue().get(p2Total - 1))
				return 1;
				
		return 0;
		
	}
	

}