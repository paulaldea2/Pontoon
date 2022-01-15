package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;

//Aldea Paul 2210814

public abstract class CardGame {
	
	
	int numOfplayers; //number of players
	public ArrayList<Player> players; //players array
	public Deck deck;
	
	//This constructor creates the deck and sets the number of players for this game;
	public CardGame (int nplayers) {
		deck = new Deck();//creates the deck;
		deck.shuffle(); //shuffle the deck;
		
		numOfplayers = nplayers;
		
		players = new ArrayList<Player>();
		
		for(int i = 0; i < nplayers; i++) {
			Player player = new Player("Player: " + i);
			players.add(player);
		}
	}
	
	//Deals the number of initial cards to each player;
	public abstract void dealInitialCards();
	
	//This method compare the hands of two players.
	public abstract int compareHands(Player hand1, Player hand2);
	//If hand1 is better than hand2 return -1;
	//If hand2 is better than hand1 return 1;
	//If hands are equal then the method should return 0;
	
	
	public Deck getDeck() {
		return deck;
		//returns the deck.
	}
	
	//This method gets the player at the index;
	public Player getPlayer(int i)
	{
		//Assume you have added the correct number of players to the game;
		return (Player)players.get(i);
	}
	
	//Gets the number of players in the game;
	public int getNumPlayers() {
		return numOfplayers;
	}
	
}
