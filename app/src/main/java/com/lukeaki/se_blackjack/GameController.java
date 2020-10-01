// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

import java.util.concurrent.TimeUnit;

public class GameController
{
    Player user;
    Player dealer;
    Deck deck;

    public GameController(Player you, Player com)
    {
        user = you;
        dealer = com;
        deck = new Deck();
    }

    public Card hit(Player hitter)
    {
        // WHEREVER HIT IS CALLED:
        // check for a bust
        // if bust, checkwinner()
        // check handsize, if = 5 then stop

        Card drawn = hitter.newCard(deck);
        return drawn;
    }

    // I think this gets called when the stop button is pressed
    public void playDealer()
    {
        while((dealer.getHandValue() < user.getHandValue()) && (dealer.getHandSize() < 5) && (dealer.getHandValue() < 21))
        {
            dealer.newCard(deck);
        }
        checkWinner();
    }

    // returns 0 for regular hand, 1 for blackjack
    public int bjTest(Player hand)
    {
        int bjack = 0;

        if (hand.getHandValue() == 21)
        {
             bjack = 1;
        }

        return bjack;
    }

    // returns 0 for non-bust, 1 for bust
    public int bustTest(Player hand)
    {
        int bust = 0;
        if (hand.getHandValue() > 21)
        {
            bust = 1;
        }
        return bust;
    }

    public Player checkWinner()
    {
        int userVal = user.getHandValue();
        int dealerVal = dealer.getHandValue();
        if ((userVal > dealerVal || dealerVal > 21) && (userVal < 21))
        {
            return user;
        }
        else if (userVal < dealerVal || userVal > 21)
        {
            return dealer;
        }
        else
        {
            return null;
        }
    }
}
