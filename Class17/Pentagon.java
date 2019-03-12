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
public class Pentagon extends Shape{
    
    private short side;
   
    
    public Pentagon(String shapeType){
      super(shapeType);
    }
    @Override
    protected void calcArea(){
        if(this.side > 0 ){
            System.out.println("The area of the pentagon is "+ (float)(Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * side * side) / 4);
        }else{
            System.out.println("Please enter the side of the pentagon");
            this.side = kb.nextShort();
         
            
            System.out.println("The area of the pentagon is "+ (float)(Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * side * side) / 4);
        }
    }
    
    @Override
    protected void calcPerimeter(){
        if(this.side > 0){
            System.out.println("The perimeter of the "+ this.shapeType+": " + 5*this.side);
        }else{
            System.out.println("Please enter one of sides of the "+this.shapeType);
            this.side = kb.nextShort();
            System.out.println("The perimeter of the "+ this.shapeType+": " + 5*this.side);
        }
    }
    @Override
    protected void calcDiagonal(){
        if(this.side > 0){
            System.out.println("The diagonal of the pentagon is "+ (((1+(Math.sqrt(5)))/2))*this.side);
        }else{
            System.out.println("Please enter the side of the pentagon");
            this.side = kb.nextShort();
            
            
            System.out.println("The diagonal of the pentagon is "+ (((1+(Math.sqrt(5)))/2))*this.side);
        }
    }
    
    
    
}
