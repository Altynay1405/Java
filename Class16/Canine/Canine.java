package Class16.Canine;
import Class16.Animals;

/**
 *
 * 
 */
public class Canine extends Animals 
{
            
    @Override
    public void  theWayImove()
    {
        System.out.println("I am in the " + this.getClass().getSimpleName() + " class");
        System.out.println("I walk on " + this.getLegs() + " legs.");
    }
    
    @Override
    public void eat()
    {
        System.out.println("I am in the " + this.getClass().getSimpleName() + " class");
        System.out.println("I eat dog food/ I am a carnivore");
    }
    
    @Override
    public void makeNoise()
    {
        
        System.out.println("I am in the " + this.getClass().getSimpleName() + " class");
        System.out.println("I bark.");
    }
    
    @Override
    public void reproduce()
    {
        System.out.println("I am in the " + this.getClass().getSimpleName() + " class");
        System.out.println("I reproduce the normal way.");
    }
    
}