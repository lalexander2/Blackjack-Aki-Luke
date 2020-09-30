// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

import java.util.ArrayList;

public class Player{

    /* 
    Initiating a Value of Cards
    */
    int CardValue;

    /* 
    Initiating a collection of card objects
    */
    private ArrayList<Card> hand;


    
    /* 
    Method to add a card object to a players hand
    */
    public int hit(Deck deck)
    {
        hand.add(deck.drawCard());
        int Cardsum = hand.handValue();
        return Cardsum;

    }
    /*
     Method to calculate the Value of a Hand
      */
    public int handValue(Hand hand)
    {
        // Initialize Hand Value 
        int Cardsum;
        
        for (Card card : hand )
        {
            Cardsum += card.getValue();
        }
        return Cardsum;
    }

    
}
