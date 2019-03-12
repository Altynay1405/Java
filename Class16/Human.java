/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16;

/**
 *
 * @author User
 */
public class Human extends Animals {
    
    private String size;
    
    public Human (String size){
         this.size = size;
     } 
    
    
    @Override
    public void theWayImove(){
         
         System.out.println("I am in the" + this.getClass().getSimpleName()+"class");
         System.out.println("I walk with my feet.");
                
               
     }
     
    @Override 
    public void eat(){
         
         System.out.println("I am in the" + this.getClass().getSimpleName()+"class");
         System.out.println("I eat food.");
         
     }
    
     @Override
     public void makeNoise(){
         
         System.out.println("I am in the" + this.getClass().getSimpleName()+"class");
         System.out.println("I talk softly.");
         
     }
     
     @Override
     public void reproduce(){
         
         System.out.println("I am in the" + this.getClass().getSimpleName()+"class");
         System.out.println("I reproduce the normal way.");
     }

    
}
