// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

import java.util.ArrayList;

public class Player{

    /** 
    * Value of the Cards Hand
    */

    int handValue;
    /** 
    * Value of the Cards Hand
    */
    int handSize;

    /** 
    *Initiating a collection of card objects
    */
    private ArrayList<Card> hand;

    /**
    * Constructor for the Player class
     */
    public Player()
    {
        hand = new ArrayList<Card>();
        handValue = 0;
        handSize = 0;
    }
    
    /**
    *Method to add a card object to a players hand
    */
    public Card newCard(Deck deck)
    {
        Card drawn = deck.drawCard();
        hand.add(drawn);
        handValue = handValue + drawn.getValue();
        handSize++;
        return drawn;
    }
    /**
    * Method to get the value of a players hand
     */
    public int getHandValue()
    {
        return handValue;
    }
    /**
    * Method to get the amount of cards in a players hand
     */
    public int getHandSize()
    {
        return handSize;
    }

}
