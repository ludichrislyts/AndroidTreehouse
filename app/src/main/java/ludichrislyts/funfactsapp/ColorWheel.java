package ludichrislyts.funfactsapp;

import android.graphics.Color;

/**
 * Created by ludichrislyts on 11/5/2015.
 * An array of colors
 */
public class ColorWheel {
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#5300b4", // ???
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#000000", // black
            "#b7c0c7"  // light gray
    };
    /*
     * An array to hold a selection of colors used as backgrounds
     * @param num: a random number
     * @return: the color at the array index position of num
     */
    public int getColor(int num){
        return Color.parseColor(mColors[num]);
    }
}
