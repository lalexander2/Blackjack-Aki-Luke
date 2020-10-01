// Luke Alexander and Aki Maja
// CS482: Software Engineering
// Assignment 2: Blackjack

package com.lukeaki.se_blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected GameController bjGame;
    protected Player user;
    protected Player dealer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startGame();

        final Button HITBUTTON = findViewById(R.id.hit_button);
        HITBUTTON.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bjGame.hit(user);
                if (user.getHandSize() == 3)
                {
                    TextView pcard3 = findViewById(R.id.player_card_3);
                    pcard3.setVisibility(View.VISIBLE);
                }
                if (user.getHandSize() == 4)
                {
                    TextView pcard4 = findViewById(R.id.player_card_4);
                    pcard4.setVisibility(View.VISIBLE);
                }
                if (user.getHandSize() == 5)
                {
                    TextView pcard5 = findViewById(R.id.player_card_5);
                    pcard5.setVisibility(View.VISIBLE);
                }
            }
        });

        final Button STOPBUTTON = findViewById(R.id.stop_button);
        STOPBUTTON.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player winning = bjGame.playDealer();
                if (winning.equals(user))
                {
                    TextView winner = findViewById(R.id.label_winner);
                    winner.setVisibility(View.VISIBLE);
                    HITBUTTON.setEnabled(false);
                    STOPBUTTON.setEnabled(false);
                }
                else if(winning.equals(dealer))
                {
                    TextView loser = findViewById(R.id.label_loser);
                    loser.setVisibility(View.VISIBLE);
                    HITBUTTON.setEnabled(false);
                    STOPBUTTON.setEnabled(false);
                }
                else
                {
                    TextView tie = findViewById(R.id.label_tie);
                    tie.setVisibility(View.INVISIBLE);
                }
            }
        });

        Button NGButton = findViewById(R.id.newgame_button);
        NGButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bjGame.clear();
                startGame();
            }
        });
    }



    public void deal(Deck deck)
    {
        // deal 2 cards to player and dealer
        Card card;
        card = user.newCard(deck);
        TextView pcard1 = findViewById(R.id.player_card_1);
        pcard1.setText(card.toString());

        card = dealer.newCard(deck);
        TextView dcard1 = findViewById(R.id.dealer_card_1);
        dcard1.setText(card.toString());

        card = user.newCard(deck);
        TextView pcard2 = findViewById(R.id.player_card_2);
        pcard2.setText(card.toString());

        card = dealer.newCard(deck);
        TextView dcard2 = findViewById(R.id.dealer_card_2);
        dcard2.setText(card.toString());
    }

    public void startGame()
    {
        user = new Player();
        dealer = new Player();
        bjGame = new GameController(user, dealer);

        TextView dcard3 = findViewById(R.id.dealer_card_3);
        dcard3.setVisibility(View.INVISIBLE);
        TextView dcard4 = findViewById(R.id.dealer_card_4);
        dcard4.setVisibility(View.INVISIBLE);
        TextView dcard5 = findViewById(R.id.dealer_card_5);
        dcard5.setVisibility(View.INVISIBLE);

        TextView pcard3 = findViewById(R.id.player_card_3);
        pcard3.setVisibility(View.INVISIBLE);
        TextView pcard4 = findViewById(R.id.player_card_4);
        pcard4.setVisibility(View.INVISIBLE);
        TextView pcard5 = findViewById(R.id.player_card_5);
        pcard5.setVisibility(View.INVISIBLE);

        TextView loser = findViewById(R.id.label_loser);
        loser.setVisibility(View.INVISIBLE);
        TextView winner = findViewById(R.id.label_winner);
        winner.setVisibility(View.INVISIBLE);
        TextView tie = findViewById(R.id.label_tie);
        tie.setVisibility(View.INVISIBLE);

        final Button HITBUTTON = findViewById(R.id.hit_button);
        final Button STOPBUTTON = findViewById(R.id.stop_button);
        HITBUTTON.setEnabled(true);
        STOPBUTTON.setEnabled(true);

        deal(bjGame.deck);
        int userbj = bjGame.bjTest(user);
        int dealerbj = bjGame.bjTest(dealer);
    }

}