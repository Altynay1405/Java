/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class DemoPayroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       final int SIZE=7;
        int hours[]= new int[SIZE];
        double payRate[]=new double[SIZE];
        
        Payroll pay = new Payroll();
        Scanner keyboard = new Scanner(System.in);
      
        for (int i=0;i<SIZE;i++){
    
        do{ 
            System.out.println("Please enter hours for employee"+
                                 pay.getID(i)+":");
            
            hours[i]=keyboard.nextInt();
           
            
        }while (hours[i] <6  );
            
        }
        for (int i=0;i<SIZE;i++){
    
        do{ 
            
            System.out.println("Please enter payrate for employee"+
                                 pay.getID(i)+":");
 
            payRate[i]=keyboard.nextDouble();
        
            
        }while (payRate[i] <6 );
            
            }
    
    
 pay.setHours(hours);
 pay.setPayRate(payRate);
 pay.setWages();
        for (int i=0;i<SIZE;i++){
       
            System.out.println("Grosspay for employee"+
                                 pay.getID(i)+":");
            
            System.out.println(pay.getWages(i));
            
            
    
}
        int idused;
        System.out.print("Enter id");
        idused= keyboard.nextInt();
         System.out.print(pay.grossPay(idused));
    }
}
    