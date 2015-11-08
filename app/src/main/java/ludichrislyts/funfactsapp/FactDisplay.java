package ludichrislyts.funfactsapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

import static ludichrislyts.funfactsapp.R.*;

public class FactDisplay extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private Images mImages = new Images();
    public int idForMatchingPicToFact = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_fact_display);
        // Declare our View variables and assign the Views from the layour file
        final TextView factLabel = (TextView) findViewById(id.FactTextView);
        final TextView question = (TextView) findViewById(id.textView);
        final Button showFactButton = (Button) findViewById(id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(id.relativeLayout);
        final MediaPlayer mMediaPlayer = MediaPlayer.create(getApplicationContext(), raw.click);
        final ImageView pictureView = (ImageView) findViewById(id.picture);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pictureView.setVisibility(View.INVISIBLE);
                mMediaPlayer.start();
                Random randomGenerator = new Random(); // Construct a new Random number generator
                int randomFactNumber = randomGenerator.nextInt(mFactBook.mFacts.length);
                idForMatchingPicToFact = randomFactNumber;
                // get random fact
                String fact = mFactBook.getFact(randomFactNumber);
                int randomColorNumber = randomGenerator.nextInt(mColorWheel.mColors.length);
                // get random color
                int color = mColorWheel.getColor(randomColorNumber);
                // Update the label with our dynamic fact
                relativeLayout.setBackgroundColor(color);
                question.setHighlightColor(color);
                factLabel.setText(fact);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
        FloatingActionButton fab = (FloatingActionButton) findViewById(id.fab);
        FloatingActionButton.OnClickListener imageButton = new FloatingActionButton.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(pictureView.isShown()){
                    pictureView.setVisibility(View.INVISIBLE);
                }else{
                    int pic = mImages.getPic(idForMatchingPicToFact);
                    pictureView.setImageResource(pic);
                    pictureView.setVisibility((View.VISIBLE));
                }
            }
        };
        fab.setOnClickListener(imageButton);
    }
}




