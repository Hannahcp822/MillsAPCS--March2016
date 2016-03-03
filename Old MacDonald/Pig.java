
/**
 * Write a description of class Pig here.
 * 
 * @author Hannah Pang
 * @version March 3, 2016
 */

public class Pig implements Animal
{
    // instance variables - replace the example below with your own
    private String myType;
    private String mySound;

    /**
     * Constructor for objects of class Pig
     */
    public Pig(String type, String sound)
    {
        // initialise instance variables
        myType = type;
        mySound = sound;
    }

    /**
     * Methods
     */
    public String getSound()
    {
        return mySound;
    }
    
    public String getType()
    {
        return myType;
    }
}
