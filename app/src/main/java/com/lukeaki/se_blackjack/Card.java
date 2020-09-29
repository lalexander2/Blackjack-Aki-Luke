// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

public class Card {
    // Give a card a value
    private int value;

    // Give a card a suit
    private String suit;

    // Give a card a rank
    private char rank;


    public String toString()
    {
        return this.rank + " of " + this.suit;
    }
}
