// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

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

    public void deal()
    {
        // deal 2 cards to player and dealer
        user.hit(deck);
        dealer.hit(deck);
        user.hit(deck);
        dealer.hit(deck);
    }

    public void hit(Player hitter)
    {
        // draw a card, add it to hitter's hand, update value and check for a bust
        // if bust, checkwinner()
        // check handsize, if = 5 then stop
    }

    public void stop()
    {

    }

    public int bjTest()
    {
        int bjack = 0;

        if (//player hand value = false)
        // {
        //      bjack = true
        // }
        return bjack;
    }

    public void checkWinner()
    {
        if (//user hand value > dealer hand value OR dealer hand value > 21)
        {
             // user wins
             // disable hit/stop,
        }
        else if (//user hand value < dealer hand value OR user hand value > 21)
        {
            // dealer wins
        }
        else
        {
            // game is a tie
        }
    }
}
