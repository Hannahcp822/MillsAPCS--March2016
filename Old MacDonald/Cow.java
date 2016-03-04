
/**
 * Write a description of class Cow here.
 * 
 * @author Hannah Pang 
 * @version March 4, 2016
 */

public class Cow implements Animal
{
    // instance variables - replace the example below with your own
    private String myType;
    private String mySound;
    
    /**
     * Constructor for objects of class Cow
     */
    public Cow()
    {
    }
    /**
     * Constructor for objects of class Cow
     */
    public Cow(String type, String sound)
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
