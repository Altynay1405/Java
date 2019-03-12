/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;

/**
 *
 * @author User
 * 
 */

public class Class18 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //This method is not an appropriate use of interface
        Area area = new Circle("Circle");
        area.calcArea();
        
        Perimeter perimeter =  new Circle("Circle");
        perimeter.calcPerimeter();
        
        //
        Circle circle = new Circle("Circle");
        circle.getShapeType();
        circle.calcArea();
        circle.calcPerimeter();
        circle.calcDiameter();
        
        
        
    }
}