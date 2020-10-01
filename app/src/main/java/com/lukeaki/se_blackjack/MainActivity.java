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
    protected Player user = new Player();
    protected Player dealer = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dcard1 = findViewById(R.id.dealer_card_1);
        TextView dcard2 = findViewById(R.id.dealer_card_2);
        TextView dcard3 = findViewById(R.id.dealer_card_3);
        dcard3.setVisibility(View.INVISIBLE);
        TextView dcard4 = findViewById(R.id.dealer_card_4);
        dcard4.setVisibility(View.INVISIBLE);
        TextView dcard5 = findViewById(R.id.dealer_card_5);
        dcard5.setVisibility(View.INVISIBLE);

        TextView pcard1 = findViewById(R.id.player_card_1);
        TextView pcard2 = findViewById(R.id.player_card_2);
        TextView pcard3 = findViewById(R.id.player_card_3);
        pcard3.setVisibility(View.INVISIBLE);
        TextView pcard4 = findViewById(R.id.player_card_4);
        pcard4.setVisibility(View.INVISIBLE);
        TextView pcard5 = findViewById(R.id.player_card_5);
        pcard5.setVisibility(View.INVISIBLE);

        Button HitButton = findViewById(R.id.hit_button);
        HitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bjGame.hit(user);
            }
        });

        Button StopButton = findViewById(R.id.stop_button);
        StopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bjGame.playDealer();
            }
        });
    }


}