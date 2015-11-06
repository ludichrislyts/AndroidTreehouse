package ludichrislyts.funfactsapp;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
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
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        final MediaPlayer mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.click);

        //DUPLICATE OF BELOW TO TEST POSITION
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Chris hasn't made this button do anything yet.", Snackbar.LENGTH_SHORT)
//                        .setAction("Action", null).show();
//            }
//        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer.start();
                Random randomGenerator = new Random(); // Construct a new Random number generator
                int randomFactNumber = randomGenerator.nextInt(mFactBook.mFacts.length);
                // get random fact
                String fact = mFactBook.getFact(randomFactNumber);
                int randomColorNumber = randomGenerator.nextInt(mColorWheel.mColors.length);
                // get random color
                int color = mColorWheel.getColor(randomColorNumber);
                // Update the label with our dynamic fact
                relativeLayout.setBackgroundColor(color);
                factLabel.setText(fact);
                showFactButton.setTextColor(color);
            };

        };
        showFactButton.setOnClickListener(listener);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        final ImageView pictureView = (ImageView) findViewById(R.id.imageView);
        FloatingActionButton.OnClickListener imageButton = new FloatingActionButton.OnClickListener(){

            @Override
            public void onClick(View v) {
                pictureView.setImageResource(R.drawable.ostrich2);
            };


        };
        fab.setOnClickListener(imageButton);
    }
}

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);









        //images.SetVisibility(View.Gone)


//                Snackbar.make(view, "Chris hasn't made this button do anything yet.", Snackbar.LENGTH_SHORT)
//                        .setAction("Action", null).show();




