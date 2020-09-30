// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

public class Hand {

    
    // Array for Card Objects
    Card[]Hand;

    // Give 2 Cards before each round

    public Hand(Deck deck){
        
        // Array of Cards to hold players hand 
        hand = new Card[2];

        for (int i = 0; i < 2; i++)
        hand[i] = deck[i];


    }



    //newcards();

    

    // Player chooses between Hit or Stop buttons
    // Hit Method

    //hit();
    public void Hit(Deck deck)
    {
        hand.add(deck.drawCard());
    }

    // Stop Method
    //stop();
}
