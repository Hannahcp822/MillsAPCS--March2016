
/**
 * Write a description of class Chick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Chick implements Animal
{
    // instance variables - replace the example below with your own
    private String myType;
    private String mySound1;
    private String mySound2 = null;

    /**
     * Constructor for objects of class Chick (1 sound)
     */
    public Chick(String type, String sound)
    {
        // initialise instance variables
        myType = type;
        mySound1 = sound;
    }
    /**
     * Constructor for objects of class Chick (2 sounds)
     */
    public Chick(String type, String sound1, String sound2)
    {
        // initialise instance variables
        myType = type;
        mySound1 = sound1;
        mySound2 = sound2;
    }
    
    /**
     * Methods
     */
    public String getSound()
    {
        if (mySound2 == null) {
            return mySound1;
        } else {
            Random r = new Random();
            int randomNum = r.nextInt(2);
            if (randomNum == 0) {
                return mySound1;
            } else {
                return mySound2;
            }
        }
    }
    
    public String getType()
    {
        return myType;
    }
}
