package ludichrislyts.funfactsapp;

import android.graphics.drawable.Drawable;

import static ludichrislyts.funfactsapp.R.*;

/**
 * An array of drawables
 * Created by ludichrislyts on 11/5/2015.
 */
public class Images {
    public Integer[] mPictures = {
            R.drawable.ant,
            R.drawable.ostrich3,
            R.drawable.gold,
            R.drawable.bones,
            R.drawable.sun,
            R.drawable.bamboo,
            R.drawable.florida,
            R.drawable.penguin,
            R.drawable.habits,
            R.drawable.mammoth,
    };
    public int getPic(int num){
        return this.mPictures[num];
    };
}
