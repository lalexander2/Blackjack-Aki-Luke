// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

public class Player{

    
    // Array for Card Objects
    private ArrayList<Card> hand;


    // addCard Method to add cards
    public void addCard(Deck deck)
    {

    for (int i = 0; i < 2; i++)
        hand[i] = deck[i];
        deck.drawCard(i);                
    }

    //newcards();

    

    // Player chooses between Hit or Stop buttons
    // Hit Method
    
    //hit();
    public void hit(Deck deck)
    {
        hand.add(deck.drawCard());
    }

    // Stop Method
    //stop();
}
