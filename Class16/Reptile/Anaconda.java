/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.Reptile;

/**
 *
 * @author 
 */
public class Anaconda extends Reptile{

    public Anaconda() {
    }
    @Override
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I am a carnivores");
        System.out.println("I constrict my prey");
    }    
}
