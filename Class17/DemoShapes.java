/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class17;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class DemoShapes {
    
        public static void main(String[] args) {
        // TODO code application logic here
        
         Shape circle = new Circle("Circle");
        
        circle.getShapeType();
        circle.calcArea();
        circle.calcPerimeter();
        circle.calcDiagonal();
        
         
        Shape triangle = new Triangle ("Triangle");
        
        triangle.getShapeType();
        triangle.calcArea();
        triangle.calcPerimeter();
        triangle.calcDiagonal();
        
        Shape rectangle = new Rectangle("Rectangle"); //polymorphism
        
        rectangle.getShapeType();
        rectangle.calcArea();
        rectangle.calcPerimeter();
        rectangle.calcDiagonal();
        
        Shape square = new Square("Square");
        
        square.getShapeType();
        square.calcArea();
        square.calcPerimeter();
        square.calcDiagonal();
        
           
        Shape pentagon = new Pentagon("Pentagon");
        
        pentagon.getShapeType();
        pentagon.calcArea();
        pentagon.calcPerimeter();
        pentagon.calcDiagonal();
        
        Shape hexagon = new Hexagon("Hexagon");
        
        hexagon.getShapeType();
        hexagon.calcArea();
        hexagon.calcPerimeter();
        hexagon.calcDiagonal();
        
    }
}
