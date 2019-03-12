
package Class16.Birds;
import Class16.Animals;



public class Birds extends Animals
{
   
    
    @Override
    public void  theWayImove()
    {
        System.out.println("I am in the " + this.getClass().getSimpleName() + "class");
        System.out.println("I have wings to fly");
    }
    
    @Override
    public void eat()
    {
        System.out.println("I am in the " + this.getClass().getSimpleName() + "class");
        System.out.println("I eat bird food or worms.");
    }
    
    @Override
    public void makeNoise()
    {
        System.out.println("I am in the " + this.getClass().getSimpleName() + "class");
        System.out.println("I make a chirping sound.");
    }
    
    @Override
    public void reproduce()
    {
        System.out.println("I am in the " + this.getClass().getSimpleName() + "class");
        System.out.println("I lay eggs.");
    }
}
