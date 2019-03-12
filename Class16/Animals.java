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
public class Animals {
    
    private int eyes;
    private int ears;
    private int nose;
    private int mouth;
    private int hands;
    private int legs;
    private int tail;
    private int wings;
    private String size;
    
    public Animals(){
        
    }
        
     public Animals (String size){
         this.size = size;
     }      
     
     public void theWayImove(){
         
         System.out.println("I am in the" + this.getClass().getSimpleName()+"class");
         System.out.println("I don`t have legs.");
                
               
     }
     
     public void eat(){
         
         System.out.println("I am in the" + this.getClass().getSimpleName()+"class");
         System.out.println("I don`t eat.");
         
     }
    
     public void makeNoise(){
         
         System.out.println("I am in the" + this.getClass().getSimpleName()+"class");
         System.out.println("I don`t make a genetic noise.");
         
     }
     
     
     public void reproduce(){
         
         System.out.println("I am in the" + this.getClass().getSimpleName()+"class");
         System.out.println("I don`t reproduce.");
     }

    /**
     * @return the eyes
     */
    public int getEyes() {
        return eyes;
    }

    /**
     * @param eyes the eyes to set
     */
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    /**
     * @return the ears
     */
    public int getEars() {
        return ears;
    }

    /**
     * @param ears the ears to set
     */
    public void setEars(int ears) {
        this.ears = ears;
    }

    /**
     * @return the nose
     */
    public int getNose() {
        return nose;
    }

    /**
     * @param nose the nose to set
     */
    public void setNose(int nose) {
        this.nose = nose;
    }

    /**
     * @return the mouth
     */
    public int getMouth() {
        return mouth;
    }

    /**
     * @param mouth the mouth to set
     */
    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    /**
     * @return the hands
     */
    public int getHands() {
        return hands;
    }

    /**
     * @param hands the hands to set
     */
    public void setHands(int hands) {
        this.hands = hands;
    }

    /**
     * @return the legs
     */
    public int getLegs() {
        return legs;
    }

    /**
     * @param legs the legs to set
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * @return the tail
     */
    public int getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(int tail) {
        this.tail = tail;
    }

    /**
     * @return the wings
     */
    public int getWings() {
        return wings;
    }

    /**
     * @param wings the wings to set
     */
    public void setWings(int wings) {
        this.wings = wings;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
     
     
     
    
}
