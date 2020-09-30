// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

public class Player{

    //Value of Players Hand
    int CardValue;

    // Array for Card Objects
    private ArrayList<Card> hand;


    //newcards();

    
    // Player chooses between Hit or Stop buttons
    // Hit Method
    
    //hit();
    public int hit(Deck deck)
    {
        hand.add(deck.drawCard());
        int Cardsum = hand.handValue();
        return Cardsum;

    }

    // HaNd Value 
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

    // Stop Method
    //stop();
}
