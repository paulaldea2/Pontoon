package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;

import com.bham.pij.assignments.pontoon.Card.Value;

//Aldea Paul 2210814
public class Player {
	
	public ArrayList<Card> hand = new ArrayList<Card>();
	public Deck deck;
	
	String playername;
	
	public Player(String name) {
		playername = name;
	}
	
	public String getName(String playername) {
		return playername;
	}
	
	public void dealToPlayer(Card card) {
		hand.add(card);
	}
	
	public void removeCard(Card card) {
		hand.remove(card);
	}
	
	public ArrayList<Integer> getNumericalHandValue(){
		int total = 0, total1 = 0, total2 = 0, total3 = 0, total4 = 0;
		int ACEs = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(Card c: hand) {
			if(c.getValue() == Value.ACE) ACEs ++;
		}
		
		for(Card c: hand) {
			switch(ACEs){
				case 1:
				{
					total += c.getNumericalValue().get(0);
					total1 = total + 10;
					break;
				}
				case 2:
				{
					total += c.getNumericalValue().get(0);
					total1 = total - 1 + 11;
					total2 = total1 - 1 + 11;
					break;
				}
				case 3: 
				{
					total += c.getNumericalValue().get(0);
					total1 = total - 1 + 11;
					total2 = total1 - 1 + 11;
					total3 = total2 - 1 + 11;
					break;
				}
				case 4:
				{
					total += c.getNumericalValue().get(0);
					total1 = total - 1 + 11;
					total2 = total1 - 1 + 11;
					total3 = total2 - 1 + 11;
					total4 = total3 - 1 + 11;
					break;
				}
				default:
				{
					total += c.getNumericalValue().get(0);
					break;
				}
			}
		}
		
		switch(ACEs) {
			case 1:
			{
				list.add(total);
				list.add(total1);
				break;
			}
			case 2:
			{
				list.add(total);
				list.add(total1);
				list.add(total2);
				break;
			}
			case 3:
			{
				list.add(total);
				list.add(total1);
				list.add(total2);
				list.add(total3);
				break;
			}
			case 4:
			{
				list.add(total);
				list.add(total1);
				list.add(total2);
				list.add(total3);
				list.add(total4);
				break;
			}
			default:
			{
				list.add(total);
				break;
			}
		}
		System.out.print(list);
		return list;
	}
	
	public int getBestNumericalHandValue() {
		int max = 0;
		for(Card c: hand) {
			if(max < c.getNumericalValue().get(0))max = c.getNumericalValue().get(0);
		}
		return max;
	}
		
	public ArrayList<Card> getCards(){
		ArrayList<Card> list = new ArrayList<Card>();
		
		for(Card card: hand)
			list.add(card);
		
		return list;
		
	}
	
	public int getHandSize() {
		return hand.size();
	}

}
