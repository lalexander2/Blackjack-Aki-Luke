// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

public class Card {
    // Give a card a value
    private int Value;

    // Give a card a suit
    private String Suit;

    // Give a card a rank
    private char Rank;

    //List of ranks of cards
    private static String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};

    // List of Suits of cards

    private static String[] suits = {"Clubs", "Diamonds", "Spades","Hearts"};

    // To String Method 
    public String toString()
    {
        return this.rank + " of " + this.suit;
    }

    /
    // Card  Setter 
    Card(int Suit; int values;){

        this.rank = values;
        this.suit = suit;
        


    }
}
