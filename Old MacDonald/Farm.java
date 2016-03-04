
/**
 * Write a description of class Farm here.
 * 
 * @author Hannah Pang
 * @version March 4, 2016
 */
public class Farm
{
    // instance variables - replace the example below with your own
    private Animal[] a = new Animal[3];
    
    /**
     * Constructor for objects of class Farm
     */
    public Farm()
    {
        // initialise instance variables
        a[0] = new NamedCow("cow", "Elsie", "moo");
        a[1] = new Chick("chick", "cheep", "cluck");
        a[2] = new Pig("pig", "oink");
    }

    /**
     * Method
     */
    public void animalSounds()
    {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i].getType() + " goes " + a[i].getSound());
        }
        System.out.println("The cow is known as " + ((NamedCow)a[0]).getName());
    }
}
