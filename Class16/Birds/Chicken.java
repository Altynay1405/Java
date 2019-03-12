/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.Birds;

/**
 *
 * @author Shantal Lester
 */
public class Chicken extends Birds
{
    
     private String size;
    
    public Chicken(String size){
        this.size = size;
    }
   
    @Override
   public void makeNoise()
    {
        System.out.println("I am in the " + this.getClass().getSimpleName() + "class");
        System.out.println("I make a buk-buk-buk sound");
    }
}
