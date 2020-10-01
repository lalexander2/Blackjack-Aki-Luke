// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;
import java.util.*;

public class Deck {
    // ATTRIBUTES
    // cards[] : An ArrayList of card objects, containing 1 of every unique card.
    protected ArrayList<Card> cards;

    private final int NUM_SUITS = 4;
    private final int NUM_RANKS = 13;

    /** 
    *Deck() : Constructor, fills the "cards" array with card objects
    */
    public Deck()
    {
        cards = new ArrayList<Card>();

        String suit = "";
        String rank = "";
        int value = -1;

        for (int i = 1; i <= NUM_SUITS; i++)
        {
            switch(i)
            {
                case 1:
                    suit = "Hearts";
                    break;
                case 2:
                    suit = "Diamonds";
                    break;
                case 3:
                    suit = "Spades";
                    break;
                case 4:
                    suit = "Clubs";
                    break;
            }
            for (int j = 1; j <= NUM_RANKS; j++)
            {
                switch(j)
                {
                    case 1:
                        value = 1;
                        rank = "Ace";
                        break;
                    case 2:
                        value = 2;
                        rank = "Two";
                        break;
                    case 3:
                        value = 3;
                        rank = "Three";
                        break;
                    case 4:
                        value = 4;
                        rank = "Four";
                        break;
                    case 5:
                        value = 5;
                        rank = "Five";
                        break;
                    case 6:
                        value = 6;
                        rank = "Six";
                        break;
                    case 7:
                        value = 7;
                        rank = "Seven";
                        break;
                    case 8:
                        value = 8;
                        rank = "Eight";
                        break;
                    case 9:
                        value = 9;
                        rank = "Nine";
                        break;
                    case 10:
                        value = 10;
                        rank = "Ten";
                        break;
                    case 11:
                        value = 10;
                        rank = "Jack";
                        break;
                    case 12:
                        value = 10;
                        rank = "Queen";
                        break;
                    case 13:
                        value = 10;
                        rank = "King";
                        break;
                }
                Card tempCard = new Card(suit, value, rank);
                cards.add(tempCard);
            }
        }
        shuffle();
    }
    /**
    * Method to display all the cards in the deck to the screen
     */
    public void printWholeDeck(){
        for (int i = 0; i < cards.size(); i++)
        {
            System.out.println(cards.get(i));
        }
    }

    /**
    * Method that shuffles cards happens on initialization and after each round
    */
    public void shuffle()
    {
        Random randy = new Random();
        for (int i = 0; i < cards.size(); i++)
        {
            int r = i + randy.nextInt(52 - i);

            Card temp = cards.get(r);
            cards.set(r, cards.get(i));
            cards.set(i, temp);
        }
    }

    /**
    * Method that removes the first card from the deck and returns it
     */
    public Card drawCard()
    {
        Card tempCard = cards.get(0);
        cards.remove(0);
        return tempCard;
    }

}
