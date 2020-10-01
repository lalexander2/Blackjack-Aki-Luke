// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

import java.util.ArrayList;

public class Player{

    /* 
    Initiating a Value of Cards
    */
    int handValue;

    int handSize;

    /* 
    Initiating a collection of card objects
    */
    private ArrayList<Card> hand;


    public Player()
    {
        hand = new ArrayList<Card>();
        handValue = 0;
        handSize = 0;
    }
    
    /* 
    Method to add a card object to a players hand
    */
    public Card newCard(Deck deck)
    {
        Card drawn = deck.drawCard();
        hand.add(drawn);
        handValue = handValue + drawn.getValue();
        handSize++;
        return drawn;
    }

    public int getHandValue()
    {
        return handValue;
    }

    public int getHandSize()
    {
        return handSize;
    }

}
