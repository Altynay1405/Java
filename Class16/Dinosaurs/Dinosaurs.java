package Class16.Dinosaurs;
import Class16.Animals;


public class Dinosaurs extends Animals
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
        System.out.println("I am a carnivore");
    }
    
    @Override
    public void makeNoise()
    {
        
        System.out.println("I am in the " + this.getClass().getSimpleName() + " class");
        System.out.println("I roar");
    }
    
    @Override
    public void reproduce()
    {
        System.out.println("I am in the " + this.getClass().getSimpleName() + " class");
        System.out.println("I lay eggs");
    }
}