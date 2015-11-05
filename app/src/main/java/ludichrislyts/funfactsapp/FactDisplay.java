package ludichrislyts.funfactsapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ludichrislyts.funfactsapp.ColorWheel;
import ludichrislyts.funfactsapp.FactBook;

import java.util.Random;

public class FactDisplay extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact_display);
        // Declare our View variables and assign the Views from the layour file
        final TextView factLabel = (TextView) findViewById(R.id.FactTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGenerator = new Random(); // Construct a new Random number generator
                int randomNumber = randomGenerator.nextInt(mFactBook.mFacts.length);

                String fact = mFactBook.getFact(randomNumber);
                int color = mColorWheel.getColor(randomNumber);
                // Update the label with our dynamic fact
                relativeLayout.setBackgroundColor(color);
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
