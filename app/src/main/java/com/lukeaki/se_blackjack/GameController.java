// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

import java.util.concurrent.TimeUnit;

public class GameController
{
    /**
    * Initalize user as a player object
    */
    Player user;
    /**
    * Initalize dealer as a player object
    */
    Player dealer;
    /**
    * Initalize a deck to start the game with 
    */
    Deck deck;

    /**
    * Constructor method for the game controller
    */
    public GameController(Player you, Player com)
    {
        user = you;
        dealer = com;
        deck = new Deck();
    }
    /**
    * Deal method which gives cards to players
    */
    public void deal()
    {
        // deal 2 cards to player and dealer
        user.newCard(deck);
        dealer.newCard(deck);
        user.newCard(deck);
        dealer.newCard(deck);
    }

    /**
    * Method to receive another card from the deck
    * @param hitter who is hitting
    */
    public Card hit(Player hitter)
    {
        return hitter.newCard(deck);
    }

    /**
    * I think this gets called when the stop button is pressed
    * Method that gets called when the player is done drawing more hards
    */
    public Card playDealer()
    {
        return hit(dealer);
    }

    /**
    * Method which takes the players hand value and sees if they have blackjack
    *returns 0 for regular hand, 1 for blackjack
    */
    public int bjTest(Player hand)
    {
        int bjack = 0;

        if (hand.getHandValue() == 21)
        {
             bjack = 1;
        }

        return bjack;
    }
    /**
    * Method which takes the players hand value and sees if they have busted
    *returns 0 for non-bust, 1 for bust 
    */
    public int bustTest(Player hand)
    {
        int bust = 0;
        if (hand.getHandValue() > 21)
        {
            bust = 1;
        }
        return bust;
    }
    /**
    * Method which takes the players hand value and sees if they have beat the dealer 
    */
    public Player checkWinner()
    {
        int userVal = user.getHandValue();
        int dealerVal = dealer.getHandValue();
        if ((userVal > dealerVal || dealerVal > 21) && (userVal <= 21))
        {
            return user;
        }
        else if ((userVal < dealerVal || userVal > 21) && (dealerVal <= 21))
        {
            return dealer;
        }
        else
        {
            return new Player();
        }
    }

    public void clear()
    {
        user.emptyHand();
        dealer.emptyHand();
        user.setHandValue(0);
        dealer.setHandValue(0);
        user.setHandSize(0);
        dealer.setHandSize(0);
    }
}
