package com.example.android.funfacts;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

import static com.example.android.funfacts.R.id.constraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare and assign our View variables:
        final TextView factTextView = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        // Instantiate FactBook object to return a random fact:
        final FactsBook factsBook = new FactsBook();

        // Instantiate BackGroundColors object to display a random color:
        final BackGroundColors backGroundColor = new BackGroundColors();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When button is clicked, the fact textView shows a fact randomly from the facts'list:
                String fact = factsBook.getFact();
                factTextView.setText(fact);

                // and background color changed:
                String bgColor = backGroundColor.getColor();
                int color = Color.parseColor(bgColor);
                constraintLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
