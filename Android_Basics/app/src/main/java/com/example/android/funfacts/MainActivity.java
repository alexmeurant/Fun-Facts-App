package com.example.android.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare and assign our View variables:
        final TextView factTextView = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        // Instantiate FactBook object to return a random fact:
        final FactsBook factsBook = new FactsBook();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When button is clicked, the fact textView shows a fact randomly from the facts'list:
                String fact = factsBook.getFact();
                factTextView.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
