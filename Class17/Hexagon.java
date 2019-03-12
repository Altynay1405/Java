/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class17;

/**
 *
 * @author User
 */
public class Hexagon extends Shape{
    private short side;
   
    
    public Hexagon(String shapeType){
      super(shapeType);
    }
    @Override
    protected void calcArea(){
        if(this.side > 0 ){
            System.out.println("The area of the hexagon is "+ (float)((3 * (Math.sqrt(3)))/2) * side * side);
        }else{
            System.out.println("Please enter the side of the hexagon");
            this.side = kb.nextShort();
         
            
            System.out.println("The area of the hexagon is "+ (float)((3 * (Math.sqrt(3)))/2) * side * side);
        }
    }
    
    @Override
    protected void calcPerimeter(){
        if(this.side > 0){
            System.out.println("The perimeter of the "+ this.shapeType+": " + 6*this.side);
        }else{
            System.out.println("Please enter one of sides of the "+this.shapeType);
            this.side = kb.nextShort();
            System.out.println("The perimeter of the "+ this.shapeType+": " + 6*this.side);
        }
    }
    @Override
    protected void calcDiagonal(){
   
        System.out.println("Diagonal is not available for "+ this.shapeType);
    }
}