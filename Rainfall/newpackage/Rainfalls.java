/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rainfall.newpackage;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Rainfalls {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
   String []month = {"Jan","Feb","Mar","Apr","May","Jun",
                                "Jul","Aug","Sep","Oct","Nov","Dec"};
   double []rainfall=new double[12];
   
   Scanner keyboard = new Scanner(System.in);
   
   for (int i=0;i<month.length;i++){
       do{
       System.out.println("Enter the rainfall for the month of "+month[i]+":");
       rainfall[i]=keyboard.nextDouble();
       }while (rainfall[i]<0);
       
   }
  
        
        Rainfall rain = new Rainfall (rainfall);
        
        System.out.println("The total rain for 12 months is:"+rain.totalRain());
        System.out.println("The average rain for 12 months is:"+rain.aveRain());
        System.out.println("The max monthly rain for 12 months is:"+month[rain.maxRain()]);
        System.out.println("The min monthly rain for 12 months is:"+month[rain.minRain()]);
        
        
    }
    
}
