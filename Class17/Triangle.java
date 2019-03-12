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
public class Triangle extends Shape{

    private short a, b, c, h; // sides

    public Triangle(String shapeType) {
        super(shapeType);
    }

    @Override
    protected void calcArea() {
        if (this.h > 0 && this.b > 0) {
            System.out.println("The area of the triangle is " + (this.h * this.b) * 1/2);
        } else {
            System.out.println("Please enter the height of the triangle");
            this.b = kb.nextShort();
            System.out.println("Please enter the base of the triangle");
            this.h = kb.nextShort();

            System.out.println("The area of the triangle is " +  (this.h * this.b) * 1/2);
        }
    }

    @Override
    protected void calcPerimeter() {
        if (this.a > 0 && this.b > 0 && this.c > 0) {
            this.a = kb.nextShort();
            this.b = kb.nextShort();
            this.c = kb.nextShort();
            System.out.println("The perimeter of the triangle is " + (this.a + this.b + this.c));
        } else {
            System.out.println("Please enter the a of the triangle");
            this.a = kb.nextShort();
            System.out.println("Please enter the b of the triangle");
            this.b = kb.nextShort();
            System.out.println("Please enter the c of the triangle");
            this.c = kb.nextShort();

            System.out.println("The perimeter of the triangle is " + (this.a + this.b + this.c));
        }
    }

     @Override
    protected void calcDiagonal(){
        
        System.out.println("Diagonal is not available for "+ this.shapeType);
   
    }
    
    
    }

