package ludichrislyts.funfactsapp;
import java.util.Random;
/**
 * Created by ludichrislyts on 11/5/2015.
 */
public class FactBook {
    /**
     * Created by ludichrislyts on 11/4/2015.
     */

    //Member variable )properties about the object)
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
            "Mammoths still walked the earth when the Great Pyramid was being built." };
    //Method (abilities: things the object can do)
    public String getFact(int num){
        String fact= "";
//        Random randomGenerator = new Random(); // Construct a new Random number generator
//        int randomNumber = randomGenerator.nextInt(mFacts.length);
        //Convert the randomNumber to a text fact
        fact = mFacts[num];

        return fact;
    }
}






