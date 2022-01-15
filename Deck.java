package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;

import com.bham.pij.assignments.pontoon.Card.Suit;
import com.bham.pij.assignments.pontoon.Card.Value;

//Aldea Paul 2210814

public class Deck {

	public ArrayList<Card> deck;
	
	Suit[] suits = Suit.values();
	Value[] values = Value.values();
	
	//Deck constructor should create the deck of cards
	public Deck() {
		deck = new ArrayList<Card>();
		reset();
	}
	
	//re-creates a full deck of cards in an existing deck
	public void reset() {
		deck.clear();
		
		for(Suit suit: Suit.values())
			for(Value value: Value.values())
				deck.add(new Card(suit, value));
	}
	
	//Shuffle the deck if a card exists at a particular index in the deck, it should exist at a different index 
	//after this method has been called.
	public void shuffle() {
		
		double rand = Math.random(); //random numer to swap
		
		for(int i=0; i<deck.size(); i++) {
			int j = (int)(rand * deck.size());
			Collections.swap(deck, i, j); //swap the cards
		}
		
	}
	
	//This method returns the card at the given index;
	public Card getCard(int i) {
		return (Card)deck.get(i);
	}
	
	//This method deals a random card. A random card should be selected from those remaing in the deck and returned.
	//The selected card should be removed from the deck.
	public Card dealRandomCard() {
		
		double rand = Math.random(); //get the random card;
		
		Card card = getCard((int)(rand)); //get the card at the random value;
		deck.remove((int)(rand)); //remove the card from deck;
		
		return card;//return the card;
	}
	
	//Returns the number of cards currently in the deck;
	public int size() {
		return deck.size();
	}
}

