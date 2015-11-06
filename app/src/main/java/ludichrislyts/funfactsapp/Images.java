package ludichrislyts.funfactsapp;

/**
 * An array of drawables, positions match up with corresponding facts in FactBook array
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
    /*
     * Function to select an image from the array
     * @param num: Random number used to select the fact
     * @return: Returns the image as an integer
     */
    public int getPic(int num){
        return this.mPictures[num];
    }
}
