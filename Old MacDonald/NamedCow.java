
/**
 * Write a description of class NamedCow here.
 * 
 * @author Hannah Pang  
 * @version March 3, 2016
 */

public class NamedCow extends Cow
{
    // instance variables - replace the example below with your own
    private String myName;

    /**
     * Constructor for objects of class Cow
     */
    public NamedCow(String type, String name, String sound)
    {
        // initialise instance variables
        super(type, sound);
        myName = name;
    }

    /**
     * Methods
     */
    public String getName() 
    {
        return myName;
    }
}
