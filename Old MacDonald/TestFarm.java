
/**
 * Write a description of class TestFarm here.
 * 
 * @author Hannah Pang
 * @version March 4, 2016
 */

public class TestFarm
{
    public static void main(String[] args)
    {
        // Test each animal individually
        Cow c = new Cow("cow", "moo");
        System.out.println(c.getType() + " goes " + c.getSound());
        
        Chick ch = new Chick("chick", "cheep", "cluck");
        System.out.println(ch.getType() + " goes " + ch.getSound());
        
        Pig p = new Pig("pig", "oink");
        System.out.println(p.getType() + " goes " + p.getSound());
        
        NamedCow n = new NamedCow("cow", "Elsie", "moo");
        System.out.println(n.getName() + " the " + n.getType() + " goes " + n.getSound());
        System.out.println();
        
        // Create a Farm object and invoke animal sounds method
        Farm f = new Farm();
        f.animalSounds();
    }
}
