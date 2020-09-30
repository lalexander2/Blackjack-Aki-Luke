// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;
import java.util.*;

public class Deck {
    // ATTRIBUTES
    // cards[] : An array of card objects, containing 1 of every unique card.
    protected Card[] cards = new Card[52];

    private final int NUM_SUITS = 4;
    private final int NUM_RANKS = 13;

    // METHODS:
    // Deck() : Constructor, fills the "cards" array with card objects
    public Deck()
    {
        int index = 0;
        for (int i = 1; i <= NUM_SUITS; i++)
        {
            for (int j = 1; j <= NUM_RANKS; j++)
            {
                // make card and put it into the deck
            }
        }
    }

    // shuffle() : Called on initialization and after each round
    public void shuffle()
    {
        Deck Temp = new Deck();
        Collections.shuffle(Temp);

    // Draw a Card
    public Card drawCard()
    {
        return deck.remove(0);
    } 

        
    }
}
