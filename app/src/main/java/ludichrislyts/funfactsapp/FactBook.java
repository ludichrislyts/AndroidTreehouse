package ludichrislyts.funfactsapp;
/**
 * Hold the array of facts to choose from
 * Created by ludichrislyts on 11/5/2015.
 */
public class FactBook {
    /**
     * Created by ludichrislyts on 11/4/2015.
     * Fact array positions like up with corresponding image array positions
     */
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };
    /*
     * Method that selects a fact from the array
     * @param num: a random number
     * @return: the selected fact
     */
    public String getFact(int num) {
        return mFacts[num];
    }
}






