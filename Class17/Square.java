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
public class Square extends Shape{
    private short side;
    
    public Square(String shapeType){
      super(shapeType);
    }
    
    @Override
    protected void calcArea(){
        if(this.side > 0){
            System.out.println("The area of the "+ this.shapeType+": " + this.side*this.side);
        }else{
            System.out.println("Please enter one of sides of the "+this.shapeType);
            this.side = kb.nextShort();
            System.out.println("The area of the "+ this.shapeType+": " + this.side*this.side);
        }
    }
    
    @Override
    protected void calcPerimeter(){
        if(this.side > 0){
            System.out.println("The perimeter of the "+ this.shapeType+": " + 4*this.side);
        }else{
            System.out.println("Please enter one of sides of the "+this.shapeType);
            this.side = kb.nextShort();
            System.out.println("The perimeter of the "+ this.shapeType+": " + 4*this.side);
        }
    }
    @Override
    protected void calcDiagonal(){
        if(this.side > 0){
            System.out.println("The diagonal of the "+ this.shapeType+": " + Math.sqrt(2)*this.side);
        }else{
            System.out.println("Please enter one of sides of the "+this.shapeType);
            this.side = kb.nextShort();
            
            
            System.out.println("The diagonal of the "+ this.shapeType+": " + Math.sqrt(2)*this.side);
        }
    }
}