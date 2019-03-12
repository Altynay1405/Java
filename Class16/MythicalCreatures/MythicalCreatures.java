

package Class16.MythicalCreatures;

import Class16.Animals;



public class MythicalCreatures extends Animals{
 
    
    @Override
    public void theWayImove(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I fly and/or walk");
    }    
    
}