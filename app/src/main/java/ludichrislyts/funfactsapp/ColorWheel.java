package ludichrislyts.funfactsapp;

import android.graphics.Color;

/**
 * Created by ludichrislyts on 11/5/2015.
 */
public class ColorWheel {
    Integer[] mColors = {
            Color.BLACK,
            Color.BLUE,
            Color.CYAN,
            Color.DKGRAY,
            Color.GRAY,
            Color.GREEN,
            Color.LTGRAY,
            Color.MAGENTA,
            Color.RED,
            Color.YELLOW,
    };
    public int getColor(int num){
        int color = mColors[num];
        return color;
    }
}
