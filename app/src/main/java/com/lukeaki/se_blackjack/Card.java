// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

public class Card {
    /**
    * The value of the card integer
    */
    private int value;

    /**
    * The suit of the card string
    */
    private String suit;

    /**
    * The rank of the card string
    */
    private String rank;

    /**
    * A constructor for the card class
    */
    Card(String suit, int value, String rank)
    {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    /**
    * To string method for the class Card
     */
    public String toString()
    {
        return this.rank + " of " + this.suit;
    }

    // Setters
    
    
    /* 
    Setter setting a Suit to a Card object
    @param String
    */

    public void setSuit(String x)
    {
        suit = x;
    }

    /* 
    Setter setting a Rank to a Card object
    @param String
    */

    public void setRank(String x)
    {
        rank = x;
    }

    /* 
    Setter setting a Value to a Card object
    @param Int Value of Card
    */

    public void setValue(int x)
    {
        value = x;
    }

    /**
    * Method to return the suit of the card
    */
    public String getSuit()
    {
        return suit;
    }
    /**
    * Method to return the rank of the card
    */
    public String getRank()
    {
        return rank;
    }
    /**
    * Method to return the value of the card
    */
    public int getValue()
    {
        return value;
    }

    
}
