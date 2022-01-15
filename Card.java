package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;

//Aldea Paul 2210814

public class Card {
	
	public static enum Suit{
		CLUBS,
		HEARTS,
		DIAMONDS,
		SPADES
	}
	
	public static enum Value{
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}
	
	private Suit suit;
	private Value value;
	
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public Value getValue() {
		return value;
	}
	
	public void setValue(Value value) {
		this.value = value;
	}
	
	public ArrayList<Integer> getNumericalValue(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		switch(value) {
			case ACE:{
				list.add(1);
				list.add(11);
				break;
			}
			case TWO:{
				list.add(2);
				break;
			}
			case THREE:{
				list.add(3);
				break;
			}
			case FOUR:{
				list.add(4);
				break;
			}
			case FIVE:{
				list.add(5);
				break;
			}
			case SIX:{
				list.add(6);
				break;
			}
			case SEVEN:{
				list.add(7);
				break;
			}
			case EIGHT:{
				list.add(8);
				break;
			}
			case NINE:{
				list.add(9);
				break;
			}
			case TEN:{
				list.add(10);
				break;
			}
			case JACK:{
				list.add(10);
				break;
			}
			case QUEEN:{
				list.add(10);
				break;
			}
			case KING:{
				list.add(10);
				break;
			}
		}
		return list;
	}

}
