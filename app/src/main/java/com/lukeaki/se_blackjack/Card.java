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
    private String rank;

    // Card Constructor
    Card(String suit, int value, String rank)
    {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    // To String Method 
    public String toString()
    {
        return this.rank + " of " + this.suit;
    }

    // Setters

    public void setSuit(String x)
    {
        suit = x;
    }

    public void setRank(String x)
    {
        rank = x;
    }

    public void setValue(int x)
    {
        value = x;
    }

    // Getters

    public String getSuit()
    {
        return suit;
    }

    public String getRank()
    {
        return rank;
    }

    public int getValue()
    {
        return value;
    }

    
}
